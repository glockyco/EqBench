package benchmarks.reve.loop5.Eq;

public class newV {
    public static int snippet(int n) {
        return new newV().f(n);
    }

    int f(int n) {
        int i;
        int j;
        i = n + n;//change
        j = 0;
        while (i > 0) {//change
            j++;
            i = i - 1;//change
        }
        return j;
    }
}
