package benchmarks.clever.Comp.Eq;

public class newV {
    public static int snippet() {
        return new newV().main();
    }

    private int foo(int a, int b) {
        if (a < b) {//change
            return 1;
        }
        return 0;
    }

    public int main() {
        int x = 2;
        int y = 3;
        int z = foo(x, y);
        if (z == 1) {//change
            int tmp = y;
            y = x;
            x = tmp;
        }
        return y;
    }
}
