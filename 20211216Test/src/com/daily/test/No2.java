package com.daily.test;

import java.util.Scanner;

public class No2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int user = sc.nextInt();
		if(user%3==0) {
			System.out.println(user+"는(은) 3의 배수입니다.");
		}else {
			System.out.println(user+"는(은) 3의 배수가 아닙니다.");
		}
	}

}
