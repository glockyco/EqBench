package benchmarks.reve.limit1.Neq;

public class newV {
    public static int snippet(int n) {
        return new newV().f(n);
    }

    int f(int n) {
        int r;
        r = 0;
        if (n <= 1) {
            r = n;
        } else {
            r = f(n - 3);//change
            r = n + (n - 1) + r;//change
        }
        return r;
    }
}
