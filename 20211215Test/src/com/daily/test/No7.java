package com.daily.test;

public class No7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		for (int i = 1; i <= 30; i++) {
			if(i%2==0) {
				a += i;
			}else {
				b += i;
			}
			
		}
		System.out.println("짝수합 : " + a);
		System.out.println("홀수합 : " + b);
	}

}
