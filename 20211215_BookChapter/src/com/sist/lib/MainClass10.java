package com.sist.lib;

import java.util.Iterator;
import java.util.StringJoiner;

/*
 *     클래스 객체명 = new클래스명();
 *     ====           =======
 *     = 인터페이스, 추상클래스
 *     List list = new ArrayList() => 인터페이스(List)
 *     
 *     =>객체명.메소드 ====>
 */
public class MainClass10 {
	//예약날짜 출력할때 한번씩 쓰는 Joiner
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동,박문수,심청이,이순신,강감찬";
		String[]names = name.split(",");
		
		for(String n:names) {
			System.out.println(n);
		}
		System.out.println("========JOIN========");
		String ss = String.join("-", names); //static메소
		System.out.println(ss);
		
		StringJoiner sj = new StringJoiner(",", "[", "]");
		for(String n:names) {
			sj.add(n);
		}
		System.out.println(sj.toString());
	}

}
