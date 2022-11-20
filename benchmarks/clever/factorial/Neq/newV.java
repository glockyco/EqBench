package benchmarks.clever.factorial.Neq;

public class newV {
    private int lib(int n) {
        if (n <= 0) {//change
            return 1;//change
        } else {//change
            return n * lib(n - 1);//change
        }
    }

    public int factorial(int x) {
        if (x < 5) {
            return lib(x);
        } else {
            return 0;
        }
    }
}
