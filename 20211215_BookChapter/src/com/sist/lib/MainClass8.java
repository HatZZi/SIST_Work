package com.sist.lib;

import java.util.Scanner;

public class MainClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력값 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 입력: ");
		String data = sc.next();
		//대문자 변환
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			if(c>='a' && c<='z') { //소문자면
				System.out.print((char)(c-32)); //대문자화
			}
				
		}
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			if(c>='A' && c<='Z') { //대문자면
				System.out.print((char)(c+32)); //소문자화
			}
			
		}
	}

}
