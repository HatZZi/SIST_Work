package sist.com.variable.basic;

public class test_Variable {
	
	public void practicing() {
		
		double x = 15.1;
		int y = 15;
		
		if(x<y) {
			System.out.println("It is true!");
			boolean_P();
		}else {
			System.out.println("No it's not!");
			boolean_P2();
		}
		
		
		
	}
	
	public void boolean_P() {
		
		System.out.println("Yes!!!");
		
	}
	
	public void boolean_P2() {
		
		System.out.println("No!!!!");
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		test_Variable v = new test_Variable();
		v.practicing();
		
	}

}
