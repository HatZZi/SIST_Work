package sis.com.variable.core;
//변수(기본형, 형변환) Method parameter return, operator, controller
//byte~ double, char, boolean, String
public class VariableAppEx1 {
	
	//byte byteValue1;
	public void byteMethod1() {
		//short byteValue1 = (Byte.MAX_VALUE+1)>Byte.MAX_VALUE? Byte.MAX_VALUE:0;  //지역변수
		byte byteValue1 = (10 + 200)>Byte.MAX_VALUE? Byte.MAX_VALUE : (10 + 200); //Max , Min은 상수이다.
		System.out.println(byteValue1);
	}
	public int byteMethod2() {
		byte byteValue1 = 100;
		byte byteValue2 = 100;
		return byteValue1 + byteValue2; //연산할때 기본값은 int이다.
		
	}
	
	public void intMethod(int v1) {
		int v2 = Integer.MAX_VALUE;
		//long rs = v1+v2;  // long형이어도 엉뚱한 값이 나온다. 연산결과는 int형이기때문에 엉뚱한값이 나온채로 long형에 들어
		long rs = (long)v1 + v2;
		System.out.println(rs);
	}
	public double doubleMethod() {
		return 100/3.; //뒤에 .을 붙이면 실수형으로 인식 
	}
	
	public static void main(String[] args) {
		VariableAppEx1 v = new VariableAppEx1();
		v.byteMethod1();
		/*byte b = */v.byteMethod2();
		v.intMethod(1);
		v.doubleMethod();
		
	}

}
