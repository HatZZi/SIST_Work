package com.daily.test;

import java.util.Scanner;

public class No4 {
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.print("년도 입력: ");
		int year = sc.nextInt();
		yunYear(year);
	}
	
	public void yunYear(int year) {
		if(year%4==0 && year%100!=0 || year%400==0) {
			disp(year, 1);
		}else disp(year,-1);
	}
	
	public void disp(int year, int a) {
		
		
		if( a == 1) {
			System.out.print(year+"년도는 윤년입니다.");
		}else {
			System.out.println(year+"년도는 윤년이 아닙니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No4 four = new No4();
		four.input();

	}

}
