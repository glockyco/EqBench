package benchmarks.clever.pos.Eq;

public class newV {
    private int lib(int x) {
        if (x < 0) {//change
            return -x;//change
        } else {//change
            return x;//change
        }
    }

    int client(int x) {
        if (x > 0) {
            return -lib(-x);
        } else {
            return lib(x);
        }
    }
}
