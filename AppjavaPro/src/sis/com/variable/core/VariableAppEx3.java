package sis.com.variable.core;

//by

public class VariableAppEx3 {
	
	public void castMethod1() {
		char c = 99; //char는 마이너스값이 없다.
		System.out.println((int)c);
		
		String str = "120";
		//int i = (int)str;  문자열을 int로 형변환할수 없다.
		int i = Integer.parseInt(str);
		System.out.println(i + 5);
	}
	
	public static void main(String[] args) {
		VariableAppEx3 v = new VariableAppEx3();
		v.castMethod1();
	}

}
