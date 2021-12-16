package com.daily.test;

import java.util.Scanner;

public class No11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int user = sc.nextInt();
		if(user>=60) {
			System.out.println("합격");
		}else
			System.out.println("불합격");
		
	}

}
