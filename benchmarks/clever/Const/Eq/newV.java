package benchmarks.clever.Const.Eq;

public class newV {
    private int foo(int a, int b) {
        final int d = 3;//change
        int c = b + a;//change
        return c + d;//change
    }

    public int main() {
        return foo(5, 900);
    }
}
