package benchmarks.clever.LoopUnreach2.Eq;

public class newV {
    private int foo(int a, int b) {
        int c = 0;
        if (a < 0) {
            for (int i = 1; i <= a; ++i) {//change
                c += b;//change
            }
        }
        return c;
    }

    public int main(int x) {
        return foo(2, 2);
    }
}
