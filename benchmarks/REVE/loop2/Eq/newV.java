package benchmarks.REVE.loop2.Eq;
public class newV {
	public int f(int n) {
		int i = 0;
		int j = 0;
		while (i < n) {
			j = j + 2;
			i++;
		}
		return j;
	}
}