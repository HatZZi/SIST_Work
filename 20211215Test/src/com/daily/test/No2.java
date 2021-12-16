package com.daily.test;

import java.util.Scanner;

public class No2 {
	Scanner sc = new Scanner(System.in);

	public void seasonIfElse() {
		System.out.print("달을 입력하세요(1~12) >> ");
		int user = sc.nextInt();
		
		if(user==3 || user ==4 || user ==5) {
			System.out.println("봄");
		}else if(user==6 || user ==7 | user ==8) {
			System.out.println("여름");
		}else if(user==9 || user ==10 | user ==11) {
			System.out.println("가을");
		}else
			System.out.println("겨울");
		
	}
	
	public void seasonSwitch() {
		System.out.print("달을 입력하세요(1~12) >> ");
		int user = sc.nextInt();
		switch(user) {
		case 1: case 12: case 2:
			System.out.println("겨울");
			break;
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		default : 
			System.out.println("가을");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No2 two = new No2();
		two.seasonIfElse();
		two.seasonSwitch();
		
	}

}
