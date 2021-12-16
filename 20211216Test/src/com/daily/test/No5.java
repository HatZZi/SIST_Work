package com.daily.test;

import java.util.Scanner;

public class No5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int user = sc.nextInt();
		if(user>=90) {
			System.out.println("A");
		}
		else if(user>=80) {
			System.out.println("B");
		}
		else if(user>=70) {
			System.out.println("C");
		}
		else if(user>=60) {
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
	}

}
