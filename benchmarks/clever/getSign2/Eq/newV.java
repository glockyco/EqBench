package benchmarks.clever.getSign2.Eq;

public class newV {
    public static int snippet(int x) {
        return new newV().client(x);
    }

    private int lib(int x) {
        if (x <= 0) {//change
            return -1;
        } else {
            return 1;
        }
    }

    public int client(int x) {
        if (x > 0) {
            return lib(x);
        }
        return x;
    }
}
