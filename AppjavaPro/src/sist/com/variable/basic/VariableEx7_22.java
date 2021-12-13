package sist.com.variable.basic;

public class VariableEx7_22 {
	
	public void method3(double x) {
		int h = 20;
		double d = h;
	}
	public double method4(int x, int y) {
		return x>y? x+y : x*y;
	}
	
	public static void main(String[] args) {
		VariableEx7_22 v = new VariableEx7_22();
		v.method4(5, 7);
		System.out.println(v.method4);
	}

}
