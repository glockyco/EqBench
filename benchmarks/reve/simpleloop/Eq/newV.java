package benchmarks.reve.simpleloop.Eq;

public class newV {
    public static int snippet(int z) {
        return new newV().f(z);
    }

    int f(int z) {
        int i = 1;//change
        while (i <= 10) {
            i++;
        }
        return i;
    }
}
