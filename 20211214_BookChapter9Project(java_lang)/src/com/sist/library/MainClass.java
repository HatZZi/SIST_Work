package com.sist.library;
/*
 * 자바
 * 1. 문법을 알아야한다.
 * =======================1~8장(변수,배열,클래스,연산자,제어문,메소드)
 * 2. 용도를 알아야한다.
 * =======================클래스,메소드,변수(인스턴스,static)
 *                        =====언제 인터페이스, 메소드(리턴형,매개변수)
 *                        =====예외처리(try~catch, throws)
 * 3. 조립하는 방법을 익혀라
 *    사용자 정의 클래스 + 라이브러리
 * 4. 순서(알고리즘)을 익혀라
 *    =>소스를 암기 => 순서
 *    => 자바에서 가장 쉬운 프로그램
 *       ====================
 *       네트워크 / 데이터베이스------->모든 개발자가 동일 코딩(표준화)
 *    => 구구단 / 페이지 (쉽다)
 *       2차for  1차for
 *    => 반복 / 위치확인 / CV =>분석
 *    
 *    java.lang   java.util   java.net   java.sql   java.text
 *    javax.xml   org.w3c.dom   org.w3c.sax
 *    javax.http(JSP)
 *    
 *    1. java.lang => import를 생략할 수 있다.
 *       =========
 *       1)Object : 모든 클래스(사용자정의,라이브러리)의 상속을 내리는 클래스
 *         class A(extends Object)생략이 된다.
 *         =toString(객체를 문자열화)
 *         =finalize(소멸자 함수) 객체가 메모리에서 해제딜때 자동으로 호출되는 함수
 *         =clone() : 복제 ==>스프링(prototype)
 *         
 *       2)String / StringBuffer / StringBuilder
 *         = length() : 문자의 갯수 -> ...
 *         원형)public int length()
 *         = equals() : 문자열을 비교 ->로그인, id중복체크...
 *         원형)public boolean equals(String s)
 *         = equalsIgnoreCase() : 문자열을 대소문자 상관없이 비교
 *           검색기
 *         원형)public boolean equalsIgnoreCase(String s)
 *         = substring() : 원하는 부분만 문자열을 자르는 역할
 *         원형) public String substring(int start)
 *              public String substring(int start, int end)
 *         = trim() : 좌우공백을 제거할때 사용
 *           사용자가 실수로 space사용 => 왼쪽에 공백이 있어서 찾기어려움
 *           public String trim()공백문자 제거 후 다시 리턴
 *         = indexOf =>문자를 찾기  (앞에서)
 *           public int indexOf(String s)
 *           public int indexOf(char c)
 *         = lastIndexOf =>문자를 찾기 (뒤에서)
 *         = split() 문자열을 분리해서 나눔
 *            public String[]split(String regex)
 *         = replace() ==>문자 한개 변경
 *            public String replace(char c1, char c2)
 *            public String replace(String s1, String s2)
 *         = replaceAll() ==>문자 전체 변경(정규식)
 *            public String replaceAll(String s1, String s2)
 *            한글[가-힇]
 *            영문[A-Za-z]
 *            숫자[0-9]
 *         = charAt() ==> 문자열중 문자 한개 자르는 경우
 *         = startsWith : 시작문자열
 *           public boolean startsWith(String s)
 *         = endsWith : 끝나는 문자
 *         public boolean endsWith(String s)
 *         = toUpperCase : 대문자 변환
 *         = toLowerCase : 소문자 변환
 *         = valueOf() : 모든 데이터형을 문자열로 변환
 *           valueOf(true) = "true"
 *         
 *       3)Math 
 *       4)Wrapper : 모든 데이터형을 클래스
 *         =======
 *         byte --> Byte
 *         short -->Short
 *         int --> Integer
 *         double -->Double
 *         float -->Float
 *         boolean --> Boolean
 *         
 *       5)System
 *         =======
 *         System.in
 *         System.out
 *         System.gc() => 멀티미디어, 화상...
 */

class Sawon{
	private String name;
	public Sawon(String name) {
		//생성자 => 변수의초기화
		System.out.println("Sawon 객체 메모리에 저장");
		this.name=name;
	}

	public void print() {
		//객체 기능 활용
		System.out.println("이름: "+ name);
	}
	//메모리에 해제
	//객체의 메모리에서 사라질때 자동 호출되는 메소드(소멸자)
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Sawon객체 메모리 해제...");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sawon이 가지고 있는 이름은 " + name +"입니다.";
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sawon기능 활용
		//1. 메모리에 저장
		Sawon s = new Sawon("홍길동");
		System.out.println(s.toString());//주소값 줄력
		System.out.println(s);
		//2. 활용
		s.print();
		//3. 메모리 해제 => s=null (GC)
		s=null;// 사용하지 않겠다는 뜻
		//4. 직접 해제
		System.gc(); //garbegeCollection호출(메모리에서 사용하지않거나 널값일때 회수)
		//finalize()가 호출되면 메모리에서 회
	}

}
