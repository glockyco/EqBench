package benchmarks.clever.oneN2.Eq;

public class oldV {
    public static int snippet(int x) {
        return new oldV().client(x);
    }

    private int lib(int x) {
        if (x > 10) {
            return 11;
        } else {
            return x;
        }
    }

    int client(int x) {
        if (x > lib(x)) {
            return x;
        } else {
            return lib(x);
        }
    }
}
