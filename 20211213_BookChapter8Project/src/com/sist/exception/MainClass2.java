package com.sist.exception;

public class MainClass2 {
	static String s;
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		try {
			
			s.replace("a", "b");
			System.out.println("3");
			System.out.println(10/0);   //에러발생!!!!
			System.out.println("5");
			
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("6");
			
		}catch(ArithmeticException e) {
			System.out.println("7");
			
		}catch(NullPointerException e) {
			System.out.println("8");
			
		}catch(ClassCastException e) {  //형변환이 틀린경우 클래스끼는 형변환이 안된다 상속제외!!
			System.out.println("9");
			
		}finally {                      //생략가능 특별한경우 아니면 안쓴다.
			System.out.println("10");
		}
		
		
		System.out.println("11");
	}

}
