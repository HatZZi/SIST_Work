package com.sist.exception;
/*
 *  문법
 *  변수, 메소드(연산자+제어문), 클래스, 예외처리
 *  => 활용(웹:JSP, Spring, Spring-boot, Mybatis)
 *  =>OpenAPI(카카오=> 맵, 뉴스, data.go.kr)
 *  
 *  try~catch
 */
import java.io.*;
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리
		try {
			Scanner sc = new Scanner(System.in);  
			//System.in : 표준입력 =>키보드로부터 입력을 받는 경우에 사용
			//System(클래스) => in (InputStream) => static
			//클래스명.메소드, 변수 => static
			//Math.random()
			System.out.println("계산기(1), 그림판(2), 메모장(3), 인터넷(4) 입력:");
			//입력한 값을 받아서 메모리에 저장
			int no = sc.nextInt();
			/*
			 * CheckException
			 * =IOException File관련 (경로명)
			 * =InterrupedException 쓰레드(충돌)
			 * =ClassNotFoundException
			 * =SQLException 오라클
			 * =MalformedURLException 네트워크(WEB주소)
			 */
			
			//화면을 보여주기 시작
			
			if(no==1) {
				Runtime.getRuntime().load(""); 
			}else if(no==2){
				Runtime.getRuntime().exec("");  //exe파일 실행
			}else if(no==3){
				Runtime.getRuntime().exec("");
			}else if(no==4) {
				Runtime.getRuntime().exec("");
			
			}else {
				System.out.println("메뉴 선택이 잘못되었습니다!!!");
				//예외처리 => 에러를 사전에 방지(if) ==> try~catch
				//코테 => 오류방지가 중요!!!!
			}
			
		}catch(Exception e){
			System.out.println("경로가 틀립니다!!!!");
		}

	}

}
