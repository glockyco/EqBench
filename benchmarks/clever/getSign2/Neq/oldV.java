package benchmarks.clever.getSign2.Neq;

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
        return lib(x);
    }
}
