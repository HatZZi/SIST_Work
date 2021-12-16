package com.daily.test;

public class No10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10; i < 100; i++) {
			String num = Integer.toString(i);
			int firstNum = num.charAt(0);
			int lastNum = num.charAt(1);
			if(firstNum==lastNum) {
				System.out.print(i + " ");
			}
		}

	}

}
