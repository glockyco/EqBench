package benchmarks.clever.ltfive.Eq;

public class newV {
    public static int snippet(int x) {
        return new newV().client(x);
    }

    private int lib(int x) {
        if (x < 0) {//change
            return 0;//change
        } else {
            return x;
        }
    }

    int client(int x) {
        if (x < 0) {
            return -lib((-x) * 5) / 5;
        } else {
            return lib((x + 1) * 5) / 5 - 1;
        }
    }
}
