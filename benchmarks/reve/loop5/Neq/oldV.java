package benchmarks.reve.loop5.Neq;

public class oldV {
    public static int snippet(int n) {
        return new oldV().f(n);
    }

    int f(int n) {
        int i;
        int j;
        i = 0;
        j = 0;
        while (i < n + n) {
            j++;
            i++;
        }
        return j;
    }
}
