package sis.com.variable.core;
//변수 (데이터를 담는 공간) 숫자 (정수 실수)
public class VariableAppEx2 {
	
	public int variableEx1() {
		double dValue = 25.6789;
		return (int)dValue; // int로 형변환을 하면 무조건 소숫점은 버린다.
	}
	public char variableEx2() {
		return 97;
	}
	public int variableEx3() {
		//return 97;
		return 'A';    //가능하다 아스키값으로 변환하여 65가 나옴.
	}
	public double variableEx4(int x, int y, int z) {
		return (x+y*z)/(double)(x-y);
	}
	public boolean variableEx5(int x, int y, int z) {
		return ++x == y++; //2==2
	}
	
	
	
	
	
	public static void main(String[] args) {
		VariableAppEx2 v = new VariableAppEx2();
		int rs = v.variableEx1() + v.variableEx1();
		System.out.println(v.variableEx2());
		
		System.out.println(v.variableEx4(5, 7, 6));
		System.out.println(v.variableEx5(1, 2, 3));
	}

}
