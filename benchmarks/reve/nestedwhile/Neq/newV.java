package benchmarks.reve.nestedwhile.Neq;

public class newV {
    int f(int x, int g) {
        int i;
        i = 0;
        while (i < x) {
            i = i + 1;
            g = g - 2;
            //g = g + 1;//change
            while (x < i) {
                //x = x + 2;//change
                x = x + 1;//change
                g = g + 2;//change
            }
        }
        return g;
    }
}
