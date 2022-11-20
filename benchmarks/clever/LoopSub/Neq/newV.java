package benchmarks.clever.LoopSub.Neq;

public class newV {
    private int foo(int a, int b) {
        int c = b;//change
        for (int i = 0; i < 2; ++i) {//change
            c -= a;//change
        }
        return c;
    }

    public int main() {
        return foo(900, 5);//change
    }
}
