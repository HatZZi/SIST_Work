package sis.com.variable.core;

public class VariableAppEx1_222 {
	
	public char doubleMethod(short x, char y) {
		
		
		System.out.println((char)(x+y));
		return (char)(x+y);
		
		
	}
	
	public void binaryMethod() {
		//0~9 abcdef   16
		//0~7          8
		int vx = 0xf; // 16
		int vo = 010; // 8
		int vd = 100;
		System.out.println(Integer.toBinaryString(vd));  //vd 를 2진수로 변환
		System.out.println(Integer.toBinaryString(vo));  //vd 를 2진수로 변환
		System.out.println(Integer.toBinaryString(vx));  //vd 를 2진수로 변환
		
	}
	
	public void formatPrint() {
		System.out.printf("오늘은 %d입니다\n", 15);
		int c = 65;
		System.out.printf("c는 정수 = %d 이고 문자는 %c 이다 \n" , c,c);
		System.out.printf("%s", "ActionData\n");
		System.out.printf("%b\n", 5>3);
		System.out.printf("정수 %d = 8진수 %o\n", 8,8);
		System.out.printf("정수 %d = 16진수 %x\n", 10,10);
		System.out.printf("%.2f\n", 95678124);
	}
	
	public void binaryMethod2() {
		System.out.printf("10진수 %d = 2진수 %s\n", 5,Integer.toBinaryString(5));
	}
	
	public static void main(String[] args) {
		VariableAppEx1_222 v = new VariableAppEx1_222();
		//v.doubleMethod((short)3, (char)66);
		v.formatPrint();
		v.binaryMethod();
		v.binaryMethod2();
		
	}

}
