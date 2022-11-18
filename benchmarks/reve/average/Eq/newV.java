package benchmarks.reve.average.Eq;

public class newV {
    double average(int n, int a[]) {
        if (n <= 0) {
            return 0;
        }
        double sum = 0;//change
        int i;
        for (i = 0; (i < n); i++) {
            sum += (double) a[i] / n;//change
        }
        return sum;//change
    }
}
