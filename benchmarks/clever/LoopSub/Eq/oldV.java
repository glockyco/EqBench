package benchmarks.clever.LoopSub.Eq;

public class oldV {
    public static int snippet() {
        return new oldV().main();
    }

    private int foo(int a, int b) {
        int c = a;
        for (int i = 0; i < 3; ++i) {
            c -= b;
        }
        return c;
    }

    public int main() {
        return foo(5, 900);
    }
}
