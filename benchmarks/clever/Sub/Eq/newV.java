package benchmarks.clever.Sub.Eq;

public class newV {
    private int foo(int a, int b) {
        int c = b - a;//change
        return c;
    }

    int main() {
        return foo(900, 5);//change
    }
}
