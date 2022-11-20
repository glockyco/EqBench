package benchmarks.clever.LoopMult2.Neq;

public class newV {
    public static int snippet(int x) {
        return new newV().main(x);
    }

    private int foo(int a, int b) {
        int c = 0;
        for (int i = 1; i <= a; ++i) {//change
            c -= b;//change
        }
        return c;
    }

    public int main(int x) {
        return foo(2, 2);
    }
}
