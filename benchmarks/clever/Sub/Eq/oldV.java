package benchmarks.clever.Sub.Eq;

public class oldV {
    public static int snippet() {
        return new oldV().main();
    }

    private int foo(int a, int b) {
        int c = a - b;
        return c;
    }

    int main() {
        return foo(5, 900);
    }
}
