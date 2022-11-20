package benchmarks.clever.LoopUnreach5.Neq;

public class newV {
    public static int snippet(int x) {
        return new newV().main(x);
    }

    private int foo(int a, int b) {
        int c = 1;//change
        if (a < 0) {
            for (int i = 1; i <= a; ++i) {//change
                c += b;//change
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
