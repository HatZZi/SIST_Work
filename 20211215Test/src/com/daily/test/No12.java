package com.daily.test;

public class No12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num = {94,85,95,88,90};
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
	}
}
