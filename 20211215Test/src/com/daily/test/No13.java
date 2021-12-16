package com.daily.test;

public class No13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num = new int[10];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i]=(int)(Math.random()*10)+1;
			sum += num[i];
			System.out.print(num[i] + " ");
		}
		double avg = sum/num.length;
		System.out.println("평균은 "+avg);
	}

}
