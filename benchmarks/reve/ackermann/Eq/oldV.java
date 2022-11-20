package benchmarks.reve.ackermann.Eq;

public class oldV {
    public static int snippet(int m, int n) {
        return new oldV().f(m, n);
    }

    int f(int m, int n) {
        int r;
        int x;
        x = 0;
        r = 0;
        if (m == 0) {
            r = n + 1;
        } else {
            if (m > 0 && n == 0) {
                r = f(m - 1, 1);
            } else {
                x = f(m, n - 1);
                r = f(m - 1, x);
            }
        }
        return r;
    }
}
