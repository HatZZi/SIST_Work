package com.sist.lib;
//trim(), valueOf(), split()
/*
 *   trim() => 좌우의 공백 제거 => 사용자가 브라우저에서 입력시에
 *             "Hello" , " Hello".trim()
 *             " Hello Java!! "
 *             ==            == 가운데에 공백은 제거못하고 좌 우에만.
 *   valueOf() => 모든 데이터형을 문자열로 변환
 *   예) valueOf(1) ==> "1"
 *      valueOf(true) ==> "true"
 *      valueOf(10.5) ==> "10.5"
 *   split() : 문자를 분리해서 배열에 저장 ==> java.util.StringTokenizer
 *             String s = admin|1234|홍길동|남자|30
 *             String[]ss = s.split("|")
 *             ss[0] = "admin"
 *             ss[1] = "1234"
 *             ss[2] = "홍길동"
 *             ss[3] = "남자"
 *             ss[4] = "30"
 */
public class MainClass9 {
	
	public static void main(String[] args) {
		String data = " Hello Java!! ";
		System.out.println("문자 갯수: " + data.length());
		String s = data.trim();
		System.out.println("문자 갯수: " + s.length());
		
		int a = 100;
		int b = 200;
		System.out.println(a+b);
		//static 메소드 (클래스명.메소드) ==> static
		//Math.random();
		String a1 = String.valueOf(a);
		String b1 = String.valueOf(b);
		System.out.println(a1 + b1);
		
		String data2 = "홍길동-남자-25-서울-개발";
		String[]info = data2.split("-");
		for(String ss:info) {
			System.out.println(ss);
		}
		
	}
}
