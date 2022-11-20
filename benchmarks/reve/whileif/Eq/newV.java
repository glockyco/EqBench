package benchmarks.reve.whileif.Eq;

public class newV {
    public static int snippet(int t, int c) {
        return new newV().f(t, c);
    }

    int f(int t, int c) {
        int x = 0;
        while (0 < c) {//change
            if (0 < t) {//change
                x++;
                c = c - 1;
            }
        }
        return x;
    }
}
