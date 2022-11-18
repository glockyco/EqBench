package benchmarks.reve.barthe.Neq;

public class newV {
    int f(int n, int c) {
        int i;
        int j;
        int x;
        i = 0;
        j = c;//change
        x = 0;
        while (i < n) {
            //j = 5 * i + c;//change
            x = x + j;
            j = j + 5;//change
            if (i == 10) {//change
                j = 10;//change
            }
            i++;
        }
        return x;
    }
}
