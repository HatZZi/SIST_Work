package com.daily.test;

import java.util.Scanner;

public class No2 {
	Scanner sc = new Scanner(System.in);
	
	public int input() {
		System.out.print("0~32767까지의 정수 입력: ");
		int userIn = sc.nextInt();
		return userIn;
	}
	
	public String makeBinary() {
		String binary = Integer.toBinaryString(input());
		return binary;
	}
	
	public void disp() {
		System.out.println(makeBinary());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No2 two = new No2();
		two.disp();
	}

}
