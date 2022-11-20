package benchmarks.clever.getSign2.Eq;

public class oldV {
    public static int snippet(int x) {
        return new oldV().client(x);
    }

    private int lib(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 0) {
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
