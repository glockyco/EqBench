package benchmarks.reve.nestedwhile.Eq;

public class oldV {
    public static int snippet(int x, int g) {
        return new oldV().f(x, g);
    }

    int f(int x, int g) {
        int i = 0;
        while (i < x) {
            i = i + 1;
            g = g - 2;
            g = g + 1;
            while (x < i) {
                x = x + 2;
                x = x - 1;
                g = g + 1;
            }
        }
        return g;
    }
}
