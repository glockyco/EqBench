package benchmarks.CLEVER.LoopUnreach2.Eq;
public class oldV {
	public int foo(int a, int b) {
		int c=0;
		if (a<0) {
			for (int i=1;i<=b;++i)
				c+=a;
		}
		return c;
	}
	public int main(int x) {
		return foo(2,2);
	}
}