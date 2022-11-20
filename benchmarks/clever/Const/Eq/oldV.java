package benchmarks.clever.Const.Eq;

public class oldV {
    public static int snippet() {
        return new oldV().main();
    }

    private int foo(int a, int b) {
        int c = a + b;
        return c + 3;
    }

    public int main() {
        return foo(5, 900);
    }
}
