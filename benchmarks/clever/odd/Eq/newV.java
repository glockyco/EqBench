package benchmarks.clever.odd.Eq;

public class newV {
    public static int snippet(int x) {
        return new newV().client(x);
    }

    private int lib(int x) {
        return (x + 1) % 2;//change
    }

    int client(int x) {
        if (lib(x) == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
