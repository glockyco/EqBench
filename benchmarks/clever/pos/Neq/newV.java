package benchmarks.clever.pos.Neq;

public class newV {
    public static int snippet(int x) {
        return new newV().client(x);
    }

    private int lib(int x) {
        int counter = 1;//change
        while (x < 0) {
            x++;
            counter++;
        }
        return counter;
    }

    int client(int x) {
        if (x > 0) {
            return -lib(-x);
        } else {
            return lib(x);
        }
    }
}
