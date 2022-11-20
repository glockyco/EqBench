package benchmarks.clever.divide.Eq;

public class newV {
    private int lib(int x, int y) {
        if (y == 0) {//change
            return 0;//change
        }
        return x / y;
    }

    public int client(int c, int d) {
        if (d == 0) {
            return 0;
        }
        return lib(c, d);
    }
}
