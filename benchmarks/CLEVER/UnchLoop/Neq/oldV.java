package benchmarks.CLEVER.UnchLoop.Neq;
public class oldV{
	public int foo(int a, int b) {
		int c=1;
		for (int i=0;i<a;++i) {
			c=c+b;
		}
		return c;
	}
	public int main() {
		return foo(5,900);
	}
}