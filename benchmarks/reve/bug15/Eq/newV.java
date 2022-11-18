package benchmarks.reve.bug15.Eq;

public class newV {
    int f(int z) {
        int y = 0;//change
        int x = 1;//change
        while (x < 10) {//change
            y = 2 + x;//change
            x = y + y;//change
        }
        return x * 2;//change
    }
}
