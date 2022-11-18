package benchmarks.reve.barthe2big2.Eq;

public class newV {
    int f(int n) {
        int i = 1;
        int x = 1;
        while (i <= n) {
            x = x * 1;//change
            i++;
        }
        i = 1;//change
        while (i <= n) {
            x = x + i;
            i++;
        }
        i = 1;
        while (i <= n) {
            x = x * 2;
            i++;
        }
        return x;
    }
}
