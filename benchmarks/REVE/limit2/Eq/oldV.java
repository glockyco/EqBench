package benchmarks.REVE.limit2.Eq;
public class oldV {
	public int f(int n) {
		int r;
		r = 0;
		if (n <= 0) {
		  r = n;
		} else {
		  r = f(n - 1);
		  r = n + r;
		}
		return r;
	}  
}