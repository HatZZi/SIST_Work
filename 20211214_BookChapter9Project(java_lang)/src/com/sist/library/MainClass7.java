package com.sist.library;
/*
 * startsWith, endsWith
 * ====================찾는 문자열 (시작 문자열/끝나는 문자열)
 * JAVA & Spring
 * 자바와 JSP
 * 자바와 오라클
 * 
 * 원형)
 *    public boolean startsWith(String s)
 *    public boolean endsWith(String s)
 *    
 * 자바
 * 오라클 => 
 * HTML/CSS
 * JavaScript(JQuery, AJAX)
 * JSP (MVC)
 * Spring
 * ========================
 * MyBatis
 * ReactJS
 * VueJS
 * ChatBot
 * ========================
 * AWS
 * ========================
 * 1권 전체적으로 공부 (8장까지 잘 공부하기)
 * 2권 컬렉션, 제네릭스
 *    IO (FileReader, FileWriter, BufferedReader)
 *    11장 12장
 */
import java.util.*;
public class MainClass7 {
	
	
	public static void main(String[] args) {
		//데이터 저장
		String[]data = {
			"혼자 배우는 자바",
			"자바와 오라클",
			"자바기반의 AWS",
			"오라클 프로그래밍",
			"자바 프로그래밍",
			"JSP AND MVC",
			"SPRing Framework",
			"MYBatis 프로그래밍",
			"자바를 이용한 챗봇",
			"AWS를 이용한 배포",
		};
		/*
		 * 검색용도로 사용
		 * 시작 문자열(startsWith)
		 * 끝나는 문자열(endsWith)
		 * 포함된 문자열(contains)
		 */
		//2. 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("검색어 입력: ");
		String fd = sc.next();
		//3. 해당 문자열 찾아서 출력
		for(String s:data) {
			if(s.contains(fd)) {
				try {
					Thread.sleep(1000);
				}catch(Exception ex) {
					
				}System.out.println(s);
			}
		}
	}

}
