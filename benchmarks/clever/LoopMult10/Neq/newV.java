package benchmarks.clever.LoopMult10.Neq;

public class newV {
    private int foo(int a, int b) {
        int c = 0;
        for (int i = 1; i <= a; ++i) {//change
            c -= b;//change
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
