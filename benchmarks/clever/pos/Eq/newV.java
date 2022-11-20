package benchmarks.clever.pos.Eq;

public class newV {
    public static int snippet(int x) {
        return new newV().client(x);
    }

    private int lib(int x) {
        if (x < 0) {//change
            return -x;//change
        } else {//change
            return x;//change
        }
    }

    int client(int x) {
        if (x > 0) {
            return -lib(-x);
        } else {
            return lib(x);
        }
    }
}
