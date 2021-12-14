package com.sist.main;

public class MainClass {
//예외가 있는 메소드 선언(라이브러리 메소드) => 자바에서 제공, 외부제공
//sleep(long m) throws InterruptedException
	
	public static void add(int a, int b) throws ArithmeticException{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
	//	Thread.sleep(100);
		try {
		add(10,20);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
