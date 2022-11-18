package benchmarks.reve.barthe.Eq;

public class newV {
    int f(int n, int c) {
        int i = 0;
        int j = c;//change
        int x = 0;
        while (i < n) {
            //j = 5 * i + c;//change
            x = x + j;
            j = j + 5;//change
            i++;
        }
        return x;
    }
}
