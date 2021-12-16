package com.sist.lib;

import java.util.Scanner;

public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 (오라클은 저장된 데이터 => 대소문자를 구분)
		//Admin => Admin, ADMIN, admin
		//1. 입력(알파벳) => 대소문자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 입력: ");
		String s = sc.nextLine();
		/*
		 * nextLine() => 공백을 포함해서 한개의 데이터 읽기
		 * ========== admin 1234 => 한개의 데이터
		 * 
		 * next() => 공백이 있으면 다른 문자열
		 * ====== admin 1234 => 두개의 데이터
		 */
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	}

}
