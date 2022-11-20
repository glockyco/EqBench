package benchmarks.clever.UnchLoop.Neq;

public class newV {
    public static int snippet() {
        return new newV().main();
    }

    private int foo(int a, int b) {
        int c = 0;//change
        for (int i = 0; i < a; ++i) {
            c = c + b;
        }
        return c + 1;//change
    }

    int main() {
        return foo(6, 900);//change
    }
}
