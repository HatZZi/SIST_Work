package com.daily.test;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int num = 0;
//		while(true) {
//			System.out.print("2자리 정수 입력(10~99) >> ");
//			num = sc.nextInt();
//			if(num<10 || num>99) {
//				System.out.println("10~99까지만 입력하세요");
//			}
//		}
		
		if(num%11==0) {
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
		
	}

}
