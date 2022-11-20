package benchmarks.reve.triangular.Eq;

public class newV {
    public static int snippet(int n) {
        return new newV().triangle(n);
    }

    private int g(int n, int s) {//change
        int r;
        r = 0;
        if (n <= 0) {
            r = s;//change
        } else {
            r = g(n - 1, n + s);//change
        }
        return r;
    }

    int triangle(int n) {
        int r;
        r = g(n, 0);//change
        return r;
    }
}
