package benchmarks.reve.loop3.Eq;

public class newV {
    public static int snippet(int n) {
        return new newV().f(n);
    }

    int f(int n) {
        int i = 1;
        int j = 2;//change
        if (n < 1) {
            n = 1;
        }
        while (i < n) {//change
            j = j + 2;
            i++;
        }
        return j;
    }
}
