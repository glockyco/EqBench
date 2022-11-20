package benchmarks.clever.UnchLoop.Eq;

public class oldV {
    public static int snippet() {
        return new oldV().main();
    }

    private int foo(int a, int b) {
        int c = 1;
        for (int i = 0; i < a; ++i) {
            c = c + b;
        }
        return c;
    }

    int main() {
        return foo(5, 900);
    }
}
