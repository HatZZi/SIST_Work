package com.daily.test;

import java.util.Scanner;

public class No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int user = sc.nextInt();
		int score = user/10;
		
		
		switch(score) {
		case 10:
		case 9: System.out.println("B학점 입니다.");
				break;
		case 8: System.out.println("C학점 입니다.");
				break;
		case 7: System.out.println("D학점 입니다.");
				break;
		case 6: System.out.println("E학점 입니다.");
				break; 
		default:System.out.println("F학점 입니다.");
				break;
		}
	}

}
