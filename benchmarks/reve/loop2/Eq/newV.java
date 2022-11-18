package benchmarks.reve.loop2.Eq;

public class newV {
    int f(int n) {
        int i = 0;//change
        int j = 0;
        while (i < n) {//change
            j = j + 2;
            i++;
        }
        return j;
    }
}
