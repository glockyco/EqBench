package benchmarks.reve.loop.Eq;

public class newV {
    public static float snippet(float n) {
        return new newV().f(n);
    }

    float f(float n) {
        float i = n;//change
        float j = 0;
        while (i >= 0) {//change
            i = i - 1;//change
            j++;
        }
        return j;
    }
}
