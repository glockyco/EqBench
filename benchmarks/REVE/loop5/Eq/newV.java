package benchmarks.REVE.loop5.Eq;
public class newV {
	public int f(int n) {
		int i;
		int j;
		i = n + n;
		j = 0;
		while (i > 0) {
		  j++;
		  i = i - 1;
		}
		return j;
	}
}