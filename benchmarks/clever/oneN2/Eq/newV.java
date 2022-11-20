package benchmarks.clever.oneN2.Eq;

public class newV {
    public static int snippet(int x) {
        return new newV().client(x);
    }

    private int lib(int x) {
        if (x > 11) {//change
            return 11;
        } else {
            return x - 1;//change
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
