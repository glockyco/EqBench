package benchmarks.REVE.triangularMod.Eq;
public class oldV {
	public int tr(int n) {
		int result;
		int i;
		i = 0;
		result = 0;
		while (i < n) {
			result = result + i;
		}
		return result;
	}
	public int f(int m) {
		int result;
		if (m > 0) {
			result = tr(m - 1);
			result = result + m;
		} else {
			result = 0;
		}
		return result;
	}
}