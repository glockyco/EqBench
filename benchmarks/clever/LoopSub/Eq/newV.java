package benchmarks.clever.LoopSub.Eq;

public class newV {
    public static int snippet() {
        return new newV().main();
    }

    private int foo(int a, int b) {
        int c = b;//change
        for (int i = 0; i < 3; ++i) {
            c -= a;//change
        }
        return c;
    }

    public int main() {
        return foo(900, 5);//change
    }
}
