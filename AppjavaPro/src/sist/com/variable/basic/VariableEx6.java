package sist.com.variable.basic;

public class VariableEx6 {
	
	public void variableMethod1() {
		int i = 10;
		System.out.println(i);
	}
	public void variableMethod2() {
		int i = 10;
		System.out.println(i);
	}
	public void variableMethod3(int value) {
		
	}
	
	public static void main(String[] args) {
		VariableEx1 v = new VariableEx1(); //다이나믹 로딩  레퍼런스타입
		VariableEx6 v2 = new VariableEx6();
		v2.variableMethod3((int)10.5);
		
		
	}

}
