package benchmarks.clever.fib.Eq;

public class newV {
    private int lib(int n) {
        int a = 0;//change
        int b = 1;//change
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
