package sist.com.variable.basic;
//변수 Variable, Constant(Final)
//boolean
public class VariableEx5 {
	
	public int actionBoolean(int x, int y, int z, int D) {
		return x+y-D+z;
	}
	
	public char actionChar(int x) {
		return (char)x;
	}
	
	public static void main(String[] args) {
		VariableEx5 v = new VariableEx5();
		System.out.println(v.actionBoolean(5, 7, 8, 14));
		System.out.println(v.actionChar(65));
	}

}
