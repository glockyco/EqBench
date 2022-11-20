package benchmarks.reve.limit1.Eq;

public class oldV {
    public static int snippet(int n) {
        return new oldV().f(n);
    }

    int f(int n) {
        int r;
        r = 0;
        if (n <= 1) {
            r = n;
        } else {
            r = f(n - 1);
            r = n + r;
        }
        return r;
    }
}
