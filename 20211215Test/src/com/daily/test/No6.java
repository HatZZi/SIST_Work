package com.daily.test;

public class No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum = 0;
		for (int i = 100; i < 1000; i++) {
			if(i%4!=0) {
				count++;
				sum += i;
			}
		}
		System.out.println("갯수 : " + count);
		System.out.println("합 : " + sum);
	}

}
