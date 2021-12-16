package com.sist.lib;
//StringTokenizer (단어별 추출) ==> split()은 배열로 들어간다는 단점이있다.
//=>네트워크 전송할때 쓴다.java.util에 있다.
//=>형태소 분석할때 자주 쓰인다. =>라이브러리 (꼬꼬마, 코모란) => 챗봇(인공지능)
//Open API=> 카카오, 네이버클로버, 구글
import java.util.*;
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names = "홍길동|심청이|춘향이|김두한|강감찬|을지문덕";
		StringTokenizer st = new StringTokenizer(names,"|");
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		System.out.println("이름 갯수: "+st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		/*
		 * new StringTokenizer(names, "|");
		 *                     =====  === 구분자
		 *                     대상
		 * st.nextToken() : 실제 자른 데이터 1개
		 * st.countTokens() : 실제 자른 갯수
		 * st. hasMoreTokens() : 가지고 있는 갯수(boolean)
		 * 
		 * ==>날짜, 이미지
		 * ==> null값이 있는 경우에는 오류가 발생한다.
		 */
	}

}
