package benchmarks.clever.LoopUnreach5.Neq;

public class oldV {
    public static int snippet(int x) {
        return new oldV().main(x);
    }

    private int foo(int a, int b) {
        int c = 0;
        if (a < 0) {
            for (int i = 1; i <= b; ++i) {
                c += a;
            }
        }
        return c;
    }

    public int main(int x) {
        if (x >= 5 && x < 7) {
            return foo(x, 5);
        }
        return 0;
    }
}
