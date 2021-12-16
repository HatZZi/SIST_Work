package com.daily.test;

public class No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, i = 1;
		
		while(i<100) {
			if(i%3 !=0) {
				i++;
				while(i<3) {
					i++;
				}
			}
			else sum+=i;
		}
		System.out.println(sum);
	}

}
