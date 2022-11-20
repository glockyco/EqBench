package benchmarks.reve.bug15.Eq;

public class oldV {
    public static int snippet(int z) {
        return new oldV().f(z);
    }

    int f(int z) {
        int x = 1;
        int y = 0;
        while (x <= 9) {
            y = x + 2;
            x = 2 * y;
        }
        return 2 * x;
    }
}
