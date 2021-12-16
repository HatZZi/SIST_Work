package com.sist.lib;

class Card{
	
	String kind;
	int num;
	// 초기화 => {}초기화 블록, 생성자()
	
	public Card() {  //디폴트 생성자
		kind ="스페이드";
		num = 1;				
	}
	
	public Card(String kind, int num) {  //오버로딩 : 중복 메소드 정의
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {   //Object가 가지고 있는 메소드를 재정의 
		                         //(오버라이딩:메소드정의를 변경)
		return kind + ":" + num;
	}
}

public class MainClass {
	/* 라이브러리 (자바에서 지원, 외부업체 지원) => 웹에서 사용되는 라이브러리
	 *          ==========  ========== open source
	 * Java.lang : 자바 코딩 기본이 되는 라이브러리
	 *    Object -> 모든 클래스에 상속을 내림 (최상위 클래스)
	 *    = 기능
	 *      1) toString() 문자열 반환
	 *      2) clone() 객체메모리 복제(새로운 메모리가 생성)
	 *      3) finalize() 객체 소멸시 자동 호출되는 메소드
	 *         ==========가비지컬렉션(프로그램이 종료시 메모리 제거)
	 *                   =========
	 *                   = 객체가 null일때
	 *                   = 사용하지 않는 변수가 있을때
	 *                   = 힙영역에 저장된 메모리
	 *                   = new
	 *                   = 지역변수, 매개변수 -> 메모리 자체관리(스택)
	 *    String
	 *    StringBuffer
	 *    StringBuilder
	 *    Math
	 *    Wrapper (전체 기본 데이터형 => 클래스)
	 *    System
	 * ============ import를 생략 가능  
	 * Java.util
	 * Java.io
	 * Java.text
	 * Java.net
	 * =========Java로 시작하는 패키지(JDK1.0)
	 * javax.xml, javax.http
	 * 
	 */
	// toString() => 호출 => 객체를 출력 => toString()을 호출한다.
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Card c2 = new Card("클로버",2);
		
		System.out.println(c1);
		System.out.println(c2);
		
		Class c3 = c1.getClass();
		System.out.println(c3);
		try {
		Class c4 = Class.forName("com.sist.lib.Card");
		System.out.println(c4);
		}catch(ClassNotFoundException e) {}

	}

}
