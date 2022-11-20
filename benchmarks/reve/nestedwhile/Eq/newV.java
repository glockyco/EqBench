package benchmarks.reve.nestedwhile.Eq;

public class newV {
    public static int snippet(int x, int g) {
        return new newV().f(x, g);
    }

    int f(int x, int g) {
        int i = 0;
        while (i < x) {
            i = i + 1;
            //g = g - 2;//change
            g = g - 1;//change
            while (x < i) {
                //x = x + 2;//change
                x = x + 1;//change
                g = g + 1;
            }
        }
        return g;
    }
}
