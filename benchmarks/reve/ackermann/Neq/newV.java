package benchmarks.reve.ackermann.Neq;

public class newV {
    int f(int m, int n) {
        int r;
        int x;
        x = 0;
        r = 0;
        if (m > 0 && n == 0) {//change
            r = f(m - 1, 1);//change
        } else {
            if (m == 1) {//change
                r = n + 1;//change
            } else {
                x = f(m, n - 1);
                r = f(m - 1, x);
            }
        }
        return r;
    }
}
