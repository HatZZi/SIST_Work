package sist.com.variable.basic;
//class (설계도, 사용자정의 자료형)
public class VariableEx3 {
	
	public void byteValueMethod() {
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		itTest();
		System.out.println(itTest());
	}
	
	
	public float itTest() {
		return 45;
	}
	
	public static void main(String[] args) {
		VariableEx3 vv = new VariableEx3();
		VariableEx2 v = new VariableEx2();
		vv.byteValueMethod();
		v.testTest();
		
	}

}
