package benchmarks.reve.inlining.Neq;

public class newV {
    int f(int x) {
        if (x > 1) {//change
            x = f(x - 2);//change
            x = x + 2;//change
        }
        if (x < 2) {//change
            x = 0;
        }
        return x;
    }
}
