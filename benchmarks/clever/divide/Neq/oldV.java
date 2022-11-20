package benchmarks.clever.divide.Neq;

public class oldV {
    public static int snippet(int c, int d) {
        return new oldV().client(c, d);
    }

    private int lib(int x, int y) {
        return x / y;
    }

    public int client(int c, int d) {
        if (d == 0) {
            return 0;
        }
        return lib(c, d);
    }
}
