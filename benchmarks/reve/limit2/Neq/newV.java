package benchmarks.reve.limit2.Neq;

public class newV {
    int f(int n) {
        int r;
        r = 0;
        if (n <= 1) {//change
            r = n;
        } else {
            r = f(n - 1);
            r = n + r;
            if (n == 10) {//change
                r = 10;//change
            }
        }
        return r;
    }
}
