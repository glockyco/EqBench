package benchmarks.clever.getSign2.Neq;

public class newV {
    private int lib(int x) {
        if (x <= 0) {//change
            return -1;
        } else {
            return 1;
        }
    }

    public int client(int x) {
        return lib(x);
    }
}
