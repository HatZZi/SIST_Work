package com.daily.test;

import java.util.Scanner;
//Math.abs(user) ==> 절대값 구하는 라이브러리
public class No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int user = sc.nextInt();
		if(user<0) {
			System.out.println(user*-1);
		}else {
			System.out.println(user);
		}
	}

}
