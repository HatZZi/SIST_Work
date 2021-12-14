package com.sist.library;
//469page ~ 471page (String) => AI, RPA, 통계; 수집=> 문자열
//웹, 윈도우=> 문자열만 사용이 가능
//HTML => <input type ="text"> 10 ==> "10"
/*
 * String : 문자열을 제어하는 클래스 / 데이터형
 *          char[]
 * =기능 (메소드)
 *   charAt() : 문자열에서 문자를 자르는 경우에 사용
 *              문자열 => ""
 *              문자 => ''
 *   원형)
 *       public char charAt(int index)
 *       Hello Java
 *       0123456789 ==> charAt(4) ==> 'o'
 *                  ==> charAt(6) ==> 'J'
 *  
 * charAt ==> 연산(계싼기)  
 */

import java.util.*;
public class MainClass3 {
    //throws는 뒤에 선언된 예외 클래스를 처리 후에 사용해야한다.
	public void calc() 
			throws ArithmeticException, NumberFormatException, Exception{
		Scanner sc = new Scanner(System.in);
		//숫자 2개 입력, 연산자 입력
		// scanner, bufferedReader => char(X), String(O)
		System.out.print("첫번째 정수 입력:");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/): ");
		String temp = sc.next();
		
		//switch=>문자case"+"
		char op = temp.charAt(0);
		switch(op) {
		case '+':
			System.out.printf("%d+%d=%d\n", num1,num2,num1+num2);
			break;
		case '-':
			System.out.printf("%d-%d=%d\n", num1,num2,num1-num2);
			break;
		case '*':
			System.out.printf("%d*%d=%d\n", num1,num2,num1*num2);
			break;
		case '/':
			System.out.printf("%d/%d=%d\n", num1,num2,num1/(double)num2);
			break;
		default:
			System.out.println("잘못된 연산자입니다!!");
		}
	}
	
	public static void main(String[] args) {
		MainClass3 m = new MainClass3();
		try {
		m.calc();  //예외처리 없으면 에러난다.
		}catch(Exception e) {
		    //여러개의 예외처리가선언된 경우 => 가장 큰 예외처리를 하면 된다.
			System.out.println(e.getMessage());
		}
	}
}
