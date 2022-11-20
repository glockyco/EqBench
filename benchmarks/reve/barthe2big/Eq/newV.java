package benchmarks.reve.barthe2big.Eq;

public class newV {
    public static int snippet(int n) {
        return new newV().f(n);
    }

    int f(int n) {
        int i = 1;
        int x = 1;
        while (i <= n) {
            x = x * 5;
            i++;
        }
        i = 1;//change
        while (i <= n) {
            x = x + i;
            i++;
        }
        return x;
    }
}
