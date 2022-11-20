package benchmarks.reve.whileif.Eq;

public class oldV {
    public static int snippet(int t, int c) {
        return new oldV().f(t, c);
    }

    int f(int t, int c) {
        int x = 0;
        if (0 < t) {
            while (0 < c) {
                x++;
                c = c - 1;
            }
        }
        return x;
    }
}
