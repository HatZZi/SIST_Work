package sist.com.variable.basic;

public class jungsuk_1 {
	int year = 0;
	int age = 14;
	
	public void calling() {
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000;
		age = age + 1;
		System.out.println(year);
		System.out.println(age);
		
	}
	public static void main(String[] args) {
		jungsuk_1 j = new jungsuk_1();
		j.calling();
		
	
		
	}

}
