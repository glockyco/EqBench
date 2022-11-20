package benchmarks.reve.inlining.Neq;

public class newV {
    public static int snippet(int x) {
        return new newV().f(x);
    }

    int f(int x) {
        if (x > 1) {//change
            x = f(x - 2);//change
            x = x + 2;//change
        }
        if (x < 2) {//change
            x = 0;
        }
        return x;
    }
}
