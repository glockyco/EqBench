package benchmarks.CLEVER.LoopUnreach2.Neq;

public class newV {
    private int foo(int a, int b) {
        int c = 1;
        if (a < 0) {
            for (int i = 1; i <= a; ++i) {
                c += b;
            }
        }
        return c;
    }

    public int main(int x) {
        return foo(2, 2);
    }
}
