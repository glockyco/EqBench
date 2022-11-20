package benchmarks.clever.multiple.Eq;

public class newV {
    private int lib(int x) {
        return x % 6;//change
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
