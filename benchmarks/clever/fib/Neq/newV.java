package benchmarks.clever.fib.Neq;

public class newV {
    public static int snippet(int x) {
        return new newV().fib(x);
    }

    private int lib(int n) {
        int a = 0;//change
        int b = 0;//change
        int i = 0;//change
        while (i < n) {//change
            i += 1;//change
            a = b;//change
            b = a + b;//change
        }
        return a;//change
    }

    public int fib(int x) {
        if (x < 5) {
            return lib(x);
        } else {
            return 0;
        }
    }
}
