package benchmarks.airy.Sign.Eq;

public class oldV {
    public static double snippet(double a, double b) {
        if (b >= 0) {
            if (a >= 0) {
                return a;
            } else {
                return -a;
            }
        } else {
            if (a >= 0) {
                return -a;
            } else {
                return a;
            }
        }
    }
}
