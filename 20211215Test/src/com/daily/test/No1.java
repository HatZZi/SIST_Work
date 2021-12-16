package com.daily.test;

import java.util.Scanner;

public class No1 {

	public void finding() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99) >> ");
		String user = sc.next();
		int user1 = user.charAt(0);
		int user2 = user.charAt(1);
		
		if(user1==user2) {
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No1 one = new No1();
		one.finding();

	}

}
