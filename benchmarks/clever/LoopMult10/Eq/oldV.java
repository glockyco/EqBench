package benchmarks.clever.LoopMult10.Eq;

public class oldV {
    public static int snippet(int x) {
        return new oldV().main(x);
    }

    private int foo(int a, int b) {
        int c = 0;
        for (int i = 1; i <= b; ++i) {
            c += a;
        }
        return c;
    }

    public int main(int x) {
        if (x >= 9 && x < 12) {
            return foo(x, 10);
        }
        return 0;
    }
}
