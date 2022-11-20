package benchmarks.reve.average.Eq;

public class oldV {
    public static double snippet(int n, int[] a) {
        return new oldV().average(n, a);
    }

    double average(int n, int a[]) {
        if (n <= 0) {
            return 0;
        }
        int sum = 0;
        int i;
        for (i = 0; (i < n); i++) {
            sum += a[i];
        }
        return (double) sum / n;
    }
}
