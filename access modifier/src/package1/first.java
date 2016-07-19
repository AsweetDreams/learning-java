package package1;
import package2.*;
import Macdinh.*;
public class first extends intoPackage{
	seconds M;
	
	public first(int a, int b, int c, int d, seconds m) {
		super(a, b, c, d);
		M = m;
	}

	public first(int a) {
		super(a);
		this.b = 100;
	}
}
