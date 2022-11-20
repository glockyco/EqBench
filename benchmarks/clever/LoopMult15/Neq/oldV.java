package benchmarks.clever.LoopMult15.Neq;

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
        if (x >= 13 && x < 16) {
            return foo(x, 15);
        }
        return 0;
    }
}
