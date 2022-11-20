package benchmarks.reve.inlining.Eq;

public class oldV {
    public static int snippet(int x) {
        return new oldV().f(x);
    }

    int f(int x) {
        if (x > 0) {
            x = f(x - 1);
            x = x + 1;
        }
        if (x < 0) {
            x = 0;
        }
        return x;
    }
}
