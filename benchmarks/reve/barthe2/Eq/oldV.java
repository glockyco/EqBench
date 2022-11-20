package benchmarks.reve.barthe2.Eq;

public class oldV {
    public static int snippet(int n) {
        return new oldV().f(n);
    }

    int f(int n) {
        int i = 0;
        int x = 0;
        while (i <= n) {
            x = x + i;
            i++;
        }
        return x;
    }
}
