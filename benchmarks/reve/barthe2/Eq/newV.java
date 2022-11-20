package benchmarks.reve.barthe2.Eq;

public class newV {
    public static int snippet(int n) {
        return new newV().f(n);
    }

    int f(int n) {
        int j = 1;//change
        int x = 0;
        while (j <= n) {//change
            x = x + j;//change
            j++;//change
        }
        return x;
    }
}
