package benchmarks.reve.loop5.Neq;

public class newV {
    public static int snippet(int n) {
        return new newV().f(n);
    }

    int f(int n) {
        int i;
        int j;
        i = n + 1;//change
        j = 0;
        while (i > 0) {//change
            j = j + 2;//change
            i = i - 1;//change
        }
        return j;
    }
}
