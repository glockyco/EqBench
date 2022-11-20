package benchmarks.clever.Add.Eq;

public class newV {
    public static int snippet() {
        return new newV().main();
    }

    private int foo(int a, int b) {
        int c = b + a;//change
        return c;
    }

    public int main() {
        return foo(5, 900);
    }
}
