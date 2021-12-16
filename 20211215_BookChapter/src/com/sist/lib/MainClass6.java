package com.sist.lib;
/*
 * replace(char c1, char c2)
 *         old       new
 * replace(String s1, String s2)
 *         old         new
 * replaceAll(String regex, String s)
 *       old                 new
 *       
 *   문자의 형식
 *   211.238.142.181
 *   127.0.0.1
 *   211.63.64.10
 *   211.238.142.1
 *   
 *   [0~9]{1,3}.[0~9]{1,3|.[0~9]{1,3|.[0~9]{1,3|
 *   
 *   맛있는 맛있고 맛있게 맛있고...
 *   맛있+
 */
public class MainClass6 {
	
	public static void main(String[] args) {
		String s = "Hello Java!!";
		String s1 = s.replace('a', 'b');
		System.out.println(s1);
		String s2 = s.replace("ll", "LL");
		System.out.println(s2);
		String data = "AAABBBcccddd1234567890 안녕하세요 자바입니다";
		String ss = data.replace("[A-Za-z0-9]", " ");
		System.out.println(ss);
		String ss1 = data.replace("[^A-Z]", "");
		// [A-Z]알파벳 대문자 전체
		// [^A-Z]대문자를 제외하고
		System.out.println(ss1);
		String ss2 = data.replaceAll("[^a-z]", "");
		System.out.println(ss2);
		String ss3 = data.replaceAll("[^0-9]", "");
		System.out.println(ss3);
		String ss4 = data.replaceAll("[^가-힇]", "");
		//한글 => 가-힇
		//^부정(제외하고)
		//[^] 부정
		// ^[가-힇] 시작 한글로 시작한 모든 문자
		//[0-9]$ 끝 숫자로 끝나는 모든 것
		//^[가|나] "가" 혹은 "나"로 시작하는 모든 문자
		//* 0번이상
		//+ 1번이상
		// ^ $ | + *  => 사용되는 기호 ==> * + ==>실제문자\\+
	}

}
