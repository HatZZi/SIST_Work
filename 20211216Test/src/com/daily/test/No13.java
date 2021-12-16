package com.daily.test;

public class No13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i <=10; i++) {
			if(i%2==0) {
				sum-=i;
			}else {
				sum+=i;
			}
			
		}
		System.out.println("합 : "+sum);
	}

}
