package benchmarks.REVE.addhorn.Eq;
public class oldV {
	public int f(int i, int j)
	{
	  int r;
	  r = 0;
	  if (i == 0) {
		r = j;
	  } else {
		r = f(i - 1, j + 1);
	  }
	  return r;
	}	
}