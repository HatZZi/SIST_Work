package com.sist.lib;
//String클래스
/*
 * String => 데이터형, 클래스형 (기능)
 * ====== 상속을 내리지 못하는 클래스
 * 원형)
 *    public final class String{
 *    }
 *    ==>Java.lang -> final이 붙는다.
 *    ==>제공한 내용을 사용한다.
 *    ==>모든 개발자 동일하게 사용
 *    1. 데이터형으로 사용
 *       String s = "";
 *    2. 클래스형으로 사용
 *       String s = new String("");
 *    3. 기능(제공) => 메소드
 *       = charAt(int index) => 자바는 인덱스번호 => 0번부터, 오라클 =>1번
 *         예)
 *           HELLO JAVA
 *           0123456789  => charAt(7) ==> 'a'
 *           => ~At(int index)
 *       ====================================
 *       = contains
 *         startsWith
 *         endsWith
 *       ====================================
 *       = 비교 (문자열) == (주소값)
 *         equals()  ===========> 대소문자 구분(비밀번호, ID)
 *         equalsIgnoreCase() ==> 이름, 검색
 *         *** 문자열 => ""
 *             ""는 자체가 주소
 *       = 찾기
 *         원하는 문자의 위치 찾기 ==> 원하는 부분 추출
 *         존재 여부 확인 (-1)이면 존재하지 않는다는뜻.
 *         앞에서 찾기 ==> indexOf
 *         뒤에서 찾기 ==> lastIndexOf (확장자)
 *         c:\\javaDev\\a.java => a.b
 *           ===      ===
 *         469page ~ 471page
 *         원형) public int indexOf(char c)
 *              public int indexOf(String s)
 *              
 *              public int lastIndexOf(char c)
 *              public int lastIndexOf(String s)
 *             
 */
//사용자 입력 => 로그인
import java.util.*;
public class MainClass2 {
	
	public static void main(String[] args) {
		//1. 입력을 받는다
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력: ");
		String id = sc.next();
		System.out.print("비밀번호 입력: ");
		String pwd = sc.next();
		System.out.println("ID: "+ id);
		System.out.println("pwd: "+ pwd);
		//2. ID, PWD를 비교한다
		final String myID = "admin";
		final String myPwd = "1234";
		//3. 결과값 출력
		//중첩 if
		if(myID.equals(id)) {
			if(myPwd.equals(pwd)) {
				System.out.println(id+"님 로그인되었습니다");
			}else {
				System.out.println("비밀번호가 틀립니다!");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다!!");
		}
	}

}
