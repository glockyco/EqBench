package benchmarks.clever.multiple.Eq;

public class oldV {
    public static int snippet(int x) {
        return new oldV().client(x);
    }

    private int lib(int x) {
        return x % 5;
    }

    int client(int x) {
        x = x * 5 * 6;
        if (lib(x) == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
