import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.PackageDeclaration;
import com.networknt.schema.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProjectIntegrityTest {

    public static final long EQ_BENCHMARK_COUNT = 147;
    public static final long NEQ_BENCHMARK_COUNT = 125;

    public static final Path BENCHMARKS_PATH = Paths.get("src/main/code/benchmarks").toAbsolutePath();

    public static final Path C_EQ_DESC_SCHEMA_PATH = Paths.get("src/test/resources/c-eq-desc-schema.json").toAbsolutePath();
    public static final Path C_NEQ_DESC_SCHEMA_PATH = Paths.get("src/test/resources/c-neq-desc-schema.json").toAbsolutePath();
    public static final Path JAVA_EQ_DESC_SCHEMA_PATH = Paths.get("src/test/resources/java-eq-desc-schema.json").toAbsolutePath();
    public static final Path JAVA_NEQ_DESC_SCHEMA_PATH = Paths.get("src/test/resources/java-neq-desc-schema.json").toAbsolutePath();

    public static final String EQ_DIR_NAME = "Eq";
    public static final String NEQ_DIR_NAME = "Neq";

    public static final String C_DESC_FILE = "C-Desc.json";
    public static final String C_OLD_V_FILE = "oldV.c";
    public static final String C_NEW_V_FILE = "newV.c";

    public static final String JAVA_DESC_FILE = "J-Desc.json";
    public static final String JAVA_OLD_V_FILE = "oldV.java";
    public static final String JAVA_NEW_V_FILE = "newV.java";

    public static final JsonSchema C_EQ_DESC_SCHEMA;
    public static final JsonSchema C_NEQ_DESC_SCHEMA;
    public static final JsonSchema JAVA_EQ_DESC_SCHEMA;
    public static final JsonSchema JAVA_NEQ_DESC_SCHEMA;

    static {
        Map<String, String> mappings = new HashMap<>();
        mappings.put("desc-properties-schema.json", "classpath:desc-properties-schema.json");
        Consumer<JsonSchemaFactory.Builder> builder = b -> b.schemaMappers(schemaMappers -> schemaMappers.mappings(mappings));
        JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V202012, builder);

        try {
            C_EQ_DESC_SCHEMA = factory.getSchema(new String(Files.readAllBytes(C_EQ_DESC_SCHEMA_PATH)));
            C_NEQ_DESC_SCHEMA = factory.getSchema(new String(Files.readAllBytes(C_NEQ_DESC_SCHEMA_PATH)));
            JAVA_EQ_DESC_SCHEMA = factory.getSchema(new String(Files.readAllBytes(JAVA_EQ_DESC_SCHEMA_PATH)));
            JAVA_NEQ_DESC_SCHEMA = factory.getSchema(new String(Files.readAllBytes(JAVA_NEQ_DESC_SCHEMA_PATH)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testProjectIntegrity() throws IOException {
        int depth = 3;
        Predicate<Path> isBenchmarkPath = p -> p.getNameCount() == BENCHMARKS_PATH.getNameCount() + depth && Files.isDirectory(p);

        List<Path> benchmarkPaths;
        try (Stream<Path> paths = Files.walk(BENCHMARKS_PATH, depth)) {
            benchmarkPaths = paths.filter(isBenchmarkPath).collect(Collectors.toList());
        }

        Predicate<Path> isNoBenchmark = p -> !isEqBenchmark(p) && !isNeqBenchmark(p);
        List<Path> eqBenchmarks = benchmarkPaths.stream().filter(this::isEqBenchmark).collect(Collectors.toList());
        List<Path> neqBenchmarks = benchmarkPaths.stream().filter(this::isNeqBenchmark).collect(Collectors.toList());
        List<Path> noBenchmarks = benchmarkPaths.stream().filter(isNoBenchmark).collect(Collectors.toList());

        Assert.assertEquals(EQ_BENCHMARK_COUNT, eqBenchmarks.size());
        Assert.assertEquals(NEQ_BENCHMARK_COUNT, neqBenchmarks.size());
        Assert.assertTrue("Unexpected paths: " + noBenchmarks, noBenchmarks.isEmpty());

        for (Path benchmarkPath : benchmarkPaths) {
            this.testBenchmarkIntegrity(benchmarkPath);
        }
    }

    public boolean isEqBenchmark(Path benchmarkPath) {
        return benchmarkPath.getFileName().toString().equals(EQ_DIR_NAME);
    }

    public boolean isNeqBenchmark(Path benchmarkPath) {
        return benchmarkPath.getFileName().toString().equals(NEQ_DIR_NAME);
    }

    public void testBenchmarkIntegrity(Path benchmarkPath) throws IOException {
        Path cDescPath = benchmarkPath.resolve(C_DESC_FILE);
        Path cOldVPath = benchmarkPath.resolve(C_OLD_V_FILE);
        Path cNewVPath = benchmarkPath.resolve(C_NEW_V_FILE);

        Path javaDescPath = benchmarkPath.resolve(JAVA_DESC_FILE);
        Path javaOldVPath = benchmarkPath.resolve(JAVA_OLD_V_FILE);
        Path javaNewVPath = benchmarkPath.resolve(JAVA_NEW_V_FILE);

        Set<Path> allFiles = new HashSet<>();
        try (DirectoryStream<Path> paths = Files.newDirectoryStream(benchmarkPath)) {
            paths.forEach(allFiles::add);
        }

        Set<Path> expectedFiles = new HashSet<>(Arrays.asList(cDescPath, cOldVPath, cNewVPath, javaDescPath, javaOldVPath, javaNewVPath));

        Set<Path> unexpectedFiles = new HashSet<>(allFiles);
        unexpectedFiles.removeAll(expectedFiles);

        Assert.assertTrue("Unexpected files: " + unexpectedFiles, unexpectedFiles.isEmpty());

        this.testDescFileIntegrity(cDescPath);
        this.testCFileIntegrity(cOldVPath);
        this.testCFileIntegrity(cNewVPath);
        this.testDescFileIntegrity(javaDescPath);
        this.testJavaFileIntegrity(javaOldVPath);
        this.testJavaFileIntegrity(javaNewVPath);
    }

    public void testDescFileIntegrity(Path descFilePath) throws IOException {
        Assert.assertTrue(descFilePath + " does not exist.", descFilePath.toFile().exists());

        boolean isEqBenchmark = isEqBenchmark(descFilePath.getParent());
        boolean isJavaDescFile = descFilePath.getFileName().toString().equals(JAVA_DESC_FILE);

        JsonSchema schema;
        if (isEqBenchmark) {
            schema = isJavaDescFile ? JAVA_EQ_DESC_SCHEMA : C_EQ_DESC_SCHEMA;
        } else {
            schema = isJavaDescFile ? JAVA_NEQ_DESC_SCHEMA : C_NEQ_DESC_SCHEMA;
        }

        Set<ValidationMessage> errors = schema.validate(new String(Files.readAllBytes(descFilePath)), InputFormat.JSON);
        Assert.assertTrue("JSON schema violations of '" + descFilePath + "': " + errors, errors.isEmpty());
    }

    private void testCFileIntegrity(Path cFilePath) {
        Assert.assertTrue(cFilePath + " does not exist.", cFilePath.toFile().exists());
    }

    public void testJavaFileIntegrity(Path javaFilePath) throws IOException {
        Assert.assertTrue(javaFilePath + " does not exist.", javaFilePath.toFile().exists());

        String expectedPackageName = BENCHMARKS_PATH.getParent().relativize(javaFilePath.getParent()).toString().replace(File.separatorChar, '.');

        CompilationUnit cu = StaticJavaParser.parse(javaFilePath);
        Optional<PackageDeclaration> packageDeclaration = cu.getPackageDeclaration();

        Assert.assertTrue("Package declaration is missing for file '" + javaFilePath + "'.", packageDeclaration.isPresent());
        String actualPackageName = packageDeclaration.get().getName().asString();
        Assert.assertEquals("Unexpected package name '" + expectedPackageName + "' for file '" + javaFilePath + "'. Should be '" + expectedPackageName + "'.", expectedPackageName, actualPackageName);
    }
}
