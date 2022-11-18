package benchmarks.reve.digits10.Eq;

public class newV {
    int f(int n) {
        int result = 1;
        int b = 1;//change
        int retval = -1;//change
        while (!(b == 0)) {//change
            if (n < 10) {//change
                retval = result;//change
                b = 0;//change
            } else if (n < 100) {//change
                retval = result + 1;//change
                b = 0;//change
            } else if (n < 1000) {//change
                retval = result + 2;//change
                b = 0;//change
            } else if (n < 10000) {//change
                retval = result + 3;//change
                b = 0;//change
            } else {//change
                n = n / 10000;//change
                result = result + 4;//change
            }
        }
        return retval;//change
    }
}
