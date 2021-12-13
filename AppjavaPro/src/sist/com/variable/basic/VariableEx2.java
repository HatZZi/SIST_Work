package sist.com.variable.basic;
//클래스 (설계도, 사용자 정의 자료형)
//ctrl+F11
public class VariableEx2 {
	
	public int testTest() {
		System.out.println(3+5);
		return 8;
	}
	
	public static void main(String[] args) {
		VariableEx2 v = new VariableEx2();
		v.testTest();
		System.out.println(v.testTest());
		
	}

}
