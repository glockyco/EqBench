package benchmarks.clever.LoopUnreach20.Neq;

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
        if (x >= 18 && x < 22) {
            return foo(x, 20);
        }
        return 0;
    }
}
