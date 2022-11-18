package benchmarks.reve.mccarthy91.Eq;

public class newV {
    int f(int x) {//change
        int r;
        r = 0;
        if (x < 101) {//change
            r = f(11 + x);//change
            r = f(r);//change
        } else {
            r = x - 10;//change
        }
        return r;
    }
}
