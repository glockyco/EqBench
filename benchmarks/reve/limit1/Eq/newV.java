package benchmarks.reve.limit1.Eq;

public class newV {
    int f(int n) {
        int r;
        r = 0;
        if (n <= 1) {
            r = n;
        } else {
            r = f(n - 2);//change
            r = n + (n - 1) + r;//change
        }
        return r;
    }
}
