package benchmarks.clever.oneBound.Eq;

public class newV {
    private int lib(int x) {
        if (x > 11) {//change
            return 11;
        } else {
            return x - 1;//change
        }
    }

    int client(int x) {
        if (x < -100 || x > 100) {
            return x;
        }
        if (x > lib(x)) {
            return x;
        } else {
            return lib(x);
        }
    }
}
