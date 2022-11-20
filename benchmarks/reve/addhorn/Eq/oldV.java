package benchmarks.reve.addhorn.Eq;

public class oldV {
    public static int snippet(int m, int n) {
        return new oldV().f(m, n);
    }

    int f(int i, int j) {
        int r;
        r = 0;
        if (i == 0) {
            r = j;
        } else {
            r = f(i - 1, j + 1);
        }
        return r;
    }
}
