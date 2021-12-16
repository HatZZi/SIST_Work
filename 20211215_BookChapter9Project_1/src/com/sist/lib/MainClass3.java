package com.sist.lib;

import java.util.Scanner;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0(가위), 1(바위), 2(보)
		String[]data = {"가위", "바위", "보"};
		//1. 컴퓨터
		int com = (int)(Math.random()*3);
		
		//2. 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) : ");
		int user = sc.nextInt();
		System.out.println("컴퓨터:"+data[com]);
		System.out.println("사용자:"+data[user]);
		System.out.println("==========결과==========");
		//3. 결과 출력
		switch(user-com) {
		case -1: case 2:
			System.out.println("컴퓨터 WIN");
		         break;
			
		case -2: case 1:
			System.out.println("사용자 WIN");
                 break;
			
		case 0: System.out.println("비겼다~");
                break;
			
		}
	}

}
