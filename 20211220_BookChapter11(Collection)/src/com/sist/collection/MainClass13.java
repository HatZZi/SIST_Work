package com.sist.collection;
// Map => 키와 값으로 설정
/*
 *  키는 중복을 허용하지 않는다 => ISBN => 우편번호
 *  값은 중복을 허용한다      => 책제목 => 실제주소
 *  순서는 가지고있지 않는다 => Iterator  // 순서가 없으면 Iterator, 있으면 for문
 *  
 *  Map => 인터페이스
 *      => 구현한 클래스
 *      => HashMap  =>Hashtable을 보완한 클래스
 *         -> 스프링, 마이바티스, 웹
 *            ====  ======== ===
 *            스프링 : 클래스등록(클래스관리=>생명주기(생성~소멸)
 *            마이바티스 : SQL(오라클실행문장)=>키,SQL
 *            웹 : 브라우저 전송할 테이터(키, 실제데이터값)
 */
import java.util.*;
public class MainClass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap(); // 웹채팅(저장=> KEY, 값(user정보)
		// map의 키는 중복이 없느 데이터가 팔요하다 ( 숫자로시작하지않는다!!!)
		// 값은 중복이 될 수 있다
		// 값을 설정할때 => put("키", 값)=>put(String key, Object value)
		// 값을 읽기 ==> get(키)
		// size() => 저장갯수
		map.put("홍길동", "90,80,78");
		map.put("박문수", "89,78,70");
		map.put("심청이", "100,90,80");
		map.put("춘향이", "78,89,50");
		map.put("이순신", "77,88,99");
		//홍길동의 성적표
//		String score = (String)map.get("홍길동");
//		String[]ss = score.split(",");
//		System.out.println(ss[0]+" "+ ss[1]+" " + ss[2]);
//		score = (String)map.get("박문수");
//		ss = score.split(",");
//		System.out.println(ss[0]+" "+ ss[1]+" " + ss[2]);
//		score = (String)map.get("심청이");
//		ss = score.split(",");
//		System.out.println(ss[0]+" "+ ss[1]+" " + ss[2]);
//		
		
		System.out.println("학생 인원수: "+ map.size());
		Set set = map.keySet(); // key는 중복이 없는 데이터
		System.out.println(set.toString());
		Iterator it = set.iterator();
		//Map => key를 얻어와서 처리
		while(it.hasNext()) {
			String key = (String)it.next();
			String value = (String)map.get(key);
			String[]ss = value.split(",");
			System.out.println(key+ " " + ss[0] + " " +ss[1]+ " " + ss[2]);
		}
		
	}

}
