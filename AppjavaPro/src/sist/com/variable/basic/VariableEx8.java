package sist.com.variable.basic;

public class VariableEx8 {
	
	public char itChar(short x, short y) {
		return x>y?(char)(x+y) : (char)(x-y);
	}
	
	
	
	public static void main(String[] args) {
		VariableEx8 v = new VariableEx8();
		
		System.out.println(v.itChar((short)60, (short)5));
		
	}

}
