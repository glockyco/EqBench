package benchmarks.clever.LoopUnreach15.Neq;

public class newV {
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
        if (x >= 13 && x < 16) {
            return foo(x, 15);
        }
        return 0;
    }
}
