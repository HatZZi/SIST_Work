package com.daily.test;

import java.util.Scanner;

public class No4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int user = sc.nextInt();
		if(user%4==0 && user%100!=0 || user%400==0) {
			System.out.println(user+"년도는 윤년입니다.");
		}else {
			System.out.println(user+"년도는 윤년이 아닙니다.");
		}
	}

}
