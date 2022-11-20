package benchmarks.reve.simpleloop.Eq;

public class oldV {
    public static int snippet(int z) {
        return new oldV().f(z);
    }

    int f(int z) {
        int i = 0;
        while (i <= 10) {
            i++;
        }
        return i;
    }
}
