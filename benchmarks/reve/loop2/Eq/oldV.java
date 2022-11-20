package benchmarks.reve.loop2.Eq;

public class oldV {
    public static int snippet(int n) {
        return new oldV().f(n);
    }

    int f(int n) {
        int i = 1;
        int j = 0;
        while (i <= n) {
            j = j + 2;
            i++;
        }
        return j;
    }
}
