package benchmarks.clever.factorial.Neq;

public class oldV {
    public static int snippet(int x) {
        return new oldV().factorial(x);
    }

    private int lib(int n) {
        if (n > 0) {
            int acc = 1;
            int x = 1;
            while (x < n + 1) {
                acc = acc * x;
                x = x + 1;
            }
            return acc;
        }
        return 0;
    }

    public int factorial(int x) {
        if (x < 5) {
            return lib(x);
        } else {
            return 0;
        }
    }
}
