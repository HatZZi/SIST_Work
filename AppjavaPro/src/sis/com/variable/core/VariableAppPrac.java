package sis.com.variable.core;

public class VariableAppPrac {
	int h = 700;
	double u = 46.754;
	Final int K = 
	
	
	public void practice1(long x, float y) {
		System.out.println(x+y);
	}
	
	
	public int practice2() {
		int i = (int)(h+u);
		return i;
		
	}
	
	
	public static void main(String[] args) {
		VariableAppPrac v = new VariableAppPrac();
		v.practice1(2, 5.494F);
		System.out.println(v.practice2());
		System.out.println(v.h+v.u);
	}

}
