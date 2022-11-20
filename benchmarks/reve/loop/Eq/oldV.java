package benchmarks.reve.loop.Eq;

public class oldV {
    public static float snippet(float n) {
        return new oldV().f(n);
    }

    float f(float n) {
        float i = 0;
        float j = 0;
        while (i <= n) {
            i++;
            j++;
        }
        return j;
    }
}
