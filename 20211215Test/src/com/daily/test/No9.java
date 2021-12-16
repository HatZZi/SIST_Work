package com.daily.test;

public class No9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sevenSum = 0;
		int nineSum = 0;
		int totalSum = 0;
		for (int i = 1; i <= 1000; i++) {
			if(i%7==0) {
				sevenSum+=i;
			}
			if(i%9==0) {
				nineSum += i;
			}
			if(i%7==0 || i%9==0) {
				totalSum += i;
			}
			
		}
		
		System.out.println("7의 배수: " + sevenSum);
		System.out.println("9의 배수: " + nineSum);
		System.out.println("7의 배수+9의 배수: " + totalSum);
	}

}
