package benchmarks.ej_hash.hashCode.Neq;

public class newV {
    private final int x;
    private final long y;
    private final int z;

    public static int snippet(int x, long y, int z) {
        return new newV(x, y, z).hashCode();
    }

    public newV(int x, long y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int hashCode() {
        int h = x;
        h = h * 31 + (int) (y ^ (y >> 32));
        //h = h * 31 + z;//change
        return h;
    }
}
