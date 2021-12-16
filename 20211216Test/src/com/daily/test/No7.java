package com.daily.test;

import java.util.Scanner;

public class No7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num1 = sc.nextInt();
		System.out.println("+,-,*,/ 입력: ");
		String opr = sc.next();
		System.out.print("정수 입력: ");
		int num2 = sc.nextInt();
		
		switch(opr) {
		case "+" :
			System.out.println(num1 + opr + num2+" = "+(num1+num2));
			break;
		case "-" :
			System.out.println(num1 + opr + num2+" = "+(num1-num2));
			break;
		case "*" :
			System.out.println(num1 + opr + num2+" = "+(num1*num2));
			break;
		default :
			System.out.println(num1 + opr + num2+" = "+(num1/num2));
			break;
		
		}
	}

}
