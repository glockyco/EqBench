package benchmarks.reve.barthe2big2.Eq;

public class oldV {
    public static int snippet(int n) {
        return new oldV().f(n);
    }

    int f(int n) {
        int i = 1;
        int x = 1;
        while (i <= n) {
            x = x * 1;
            i++;
        }
        i = 0;
        while (i <= n) {
            x = x + i;
            i++;
        }
        i = 1;
        while (i <= n) {
            x = x * 2;
            i++;
        }
        return x;
    }
}
