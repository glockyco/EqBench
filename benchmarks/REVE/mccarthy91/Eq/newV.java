package benchmarks.REVE.mccarthy91.Eq;
public class newV {
	public int f(int x) {
		int r;
		r = 0;
		if (x < 101) {
		  r = f(11 + x);
		  r = f(r);
		} else {
		  r = x - 10;
		}
		return r;
	}
}