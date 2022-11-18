package benchmarks.reve.limit2.Eq;

public class newV {
    int f(int n) {
        int r;
        r = 0;
        if (n <= 1) {//change
            r = n;
        } else {
            r = f(n - 1);
            r = n + r;
        }
        return r;
    }
}
