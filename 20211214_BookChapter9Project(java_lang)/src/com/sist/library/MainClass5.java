package com.sist.library;
// compareTo => 문자열을 비교할때
// contains => 포함

public class MainClass5 {
	
	
	
	public static void main(String[] args) {
		//int compareTo(String s) 
		//==> 라이브러리 리턴형, 매개변수, 메소드명, 기능
		//1.String 문자열을 저장
		// compareTo ==> 문자열 정렬
		String s1 = "AAA";
		String s2 = "DDD";
		int i = s1.compareTo(s2);
		System.out.println(i);
		//A-D = -3
		/*
		 * s1-s2 == - (s2가 더 크다)
		 * s1-s2 == + (s1가 더 크다)
		 * s1-s2 == 0 (둘은 같은 값이다.)
		 */
		//concat => 원형) String concat(String s) => 문자열 결합(+)
		s1 = "Hello";
		s2 = "Java!!";
		System.out.println(s1+s2);
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
	}

}
