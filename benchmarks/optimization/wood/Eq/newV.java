package benchmarks.optimization.wood.Eq;

public class newV {
    public static void snippet(double x1, double x2, double x3, double x4) {
        wood(x1, x2, x3, x4);
    }

    public final static void wood(double x1, double x2, double x3, double x4) {
        boolean condition1 = (10.0 * (x2 - x1 * x1)) == 0.0 && (5.0 - x1) == 0.0;//change
        boolean condition2 = (Math.sqrt(64) * (x4 - x3 * x3)) == 0.0 && (2.0 - x3) == 0.0;//change
        if (condition1 && condition2) {//change
            System.out.println("Solved Wood constraint");
        }
    }
}
