package com.daily.test;

import java.util.Scanner;

public class No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int user = sc.nextInt();
		
		System.out.println(user>0? user+"는 양수입니다." : user+"는 음수입니다.");
		
//		if(user>=0) {
//			System.out.println(user +"는(은) 양수입니다.");
//		}else {
//			System.out.println(user +"는(은) 음수입니다.");
//		}
		
		

	}

}
