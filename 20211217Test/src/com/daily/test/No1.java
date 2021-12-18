package com.daily.test;
/*
 * 메소드 (249p) => 한개의 작업을 하기 위한 명령문의 집합
 *    1) 재사용의 목적
 *    2) 반복을 제거
 *    3) 가독성 (보기 편하게 만든다) => 구조화 (문장=>단락)
 *                                ==============
 *                                자기소개
 *       =>유지보수 (수정, 추가)
 *    4) 메소드의 형식 => 메소드는 다른 클래스 통신(연결)
 *       접근지정어(public)리턴형 메소드명(매개변수....) ==> 선언부
 *       => 매개변수는 지역변수에 해당(메소드{}가 끝나면 자동으로 사라지는 변수)
 *          {
 *             구현부 (기능구현)
 *          }
 *       => 원형
 *       메소드
 *       ====
 *       ====================================
 *       리턴형(요청결과값)        매개변수(요청데이터)
 *       => 1개만 설정           =>여러개 사용가능
 *       => 여러개              =>3개이상(배열,클래스)
 *          (배열, 클래스, Collection)
 *       ====================================
 *       생성자 : 생략할 수 있다. => 자동으로 컴파일러가 디폴트생성자를 생성
 *       ====
 *       = 멤버변수의 초기화
 *       = 사용자로부터 입력값을 받아서 초기화
 *       = 시작동시에 서버연결, 오라클연결, 파일읽기
 *       = 오버로딩 (생성자는 여러개를 사용할 수 있다.)
 *       = 특징 : 리턴이 없다.
 */
import java.util.*;

public class No1 {
	Scanner sc = new Scanner(System.in);
	
	public void idCheck() {
		System.out.println("아이디를 입력해주세요.");
		String iduser = sc.next();
		ArrayList list = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			String id = (String)list.get(i);
			if(id.equals(iduser)) {
				System.out.println("이미 사용된 아이디입니다.");
			}else {
				System.out.println("사용이 가능한 아이디입니다.");
			}
		}
	}
	
	public int postNum() {
		System.out.println("주소를 입력해주세요.");
		String where = sc.next();
		String[]detail = where.split(" ");
		switch(detail[0]) {
		case "강남구" : return 0000;
		case "강북구" : return 1111;
		case "노원구" : return 2222;
		default : System.out.println("찾을수 없습니다.");
		          return -1;
		}
	}
	
	public void gugudan() {
		int[]num = {2,3,4,5,6,7,8,9};
		for (int i = 2; i <= 9; i++) {
			for (int j = 2; j <=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No1 one = new No1();
		one.idCheck();
		System.out.println("우편번호는 "+ one.postNum());
		one.gugudan();
	}

}
