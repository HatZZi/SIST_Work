package com.daily.test;

import java.util.Scanner;

public class No11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int user = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= user; i++) {
			sum+=i;
		}
		System.out.println("1~"+user+"까지의 합 : "+sum);
	}

}
