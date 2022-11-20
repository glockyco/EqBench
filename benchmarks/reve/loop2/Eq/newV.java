package benchmarks.reve.loop2.Eq;

public class newV {
    public static int snippet(int n) {
        return new newV().f(n);
    }

    int f(int n) {
        int i = 0;//change
        int j = 0;
        while (i < n) {//change
            j = j + 2;
            i++;
        }
        return j;
    }
}
