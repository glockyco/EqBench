package benchmarks.CLEVER.UnchLoop.Eq;
public class newV{
	public int foo(int a, int b) {
		int c=0;
		for (int i=0;i<a;++i) {
			c=c+b;
		}
		return c+1;
	}
	public int main() {
		return foo(5,900);
	}
}