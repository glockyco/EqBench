package benchmarks.reve.inlining.Eq;

public class newV {
    public static int snippet(int x) {
        return new newV().f(x);
    }

    int f(int x) {
        if (x > 1) {//change
            x = f(x - 2);//change
            x = x + 2;//change
        }
        if (x < 0) {
            x = 0;
        }
        return x;
    }
}
