package com.sist.exception;
/*
 * 프로그램 : 오류발생
 * ===============
 *  => 에러 (error) -> 소스상에서 해결할 수 없는 에러
 *     예) 메모리부족, 이클립스상의 오류
 *  => 예외 (exception) -> 소스상에서 해결이 가능한 가벼운 에러
 *     예) 1.사용자입력값이 잘못되었을때 (유효성 검사)
 *           나누기 => 10/0 => "0으로 나눌수 없습니다"
 *        2.프로그래머의 실수
 *           배열범위 초과 int[]arr = new int[2];
 *           arr[2]=100;                {0,1}
 *           네트워크, 데이터베이스 =>ip(ip가 틀려서 연결X
 *           파일의 경로명 잘못
 *           SQL문장(오라클)
 *  => 자바->실행(2번)
 *     A.java------>A.class------->실행
 *     ====== 컴파일 ======= 한줄씩 읽어서 번역        
 *     원시소스       바이트코드
 *     :프로그래머만   컴퓨터만
 *      알고있는소스   알수있는언어
 *  =>컴파일 에러(문법에러) --> CheckException
 *    =반드시 예외처리를 사용한다.
 *  =>런타임 에러(실행시 에러) --> UnCheckException
 *    =필요시에 따라서 예외처리를 한다(필수가 아님)
 *    
 *    CheckException
 *    =>java.net(네트워크)
 *    =>java.io(파일입출력)
 *    =>java.sql(오라클연결)
 *    UnCheckException
 *    =>NumberFormatException =>문자열을 정수형 변경
 *            => 웹, 윈도우(정수가 없다.->문자열)
 *            => Integer.parseInt("10");
 *               Integer.parseInt("10 "); X 공백이있으면안됨
 *               list.jsp?page=1 => "1"," 1"
 *    =>class A{
 *        public void display(){}
 *      }
 *      A.a;
 *      a.display() => NullPointerException
 *    => int[]arr = new int[2];
 *       arr[2] = 100
 *       ArrayIndexOutOgBoundsException
 *    => 10/0 --> ArithmeticException
 * ======================================== 414페이지 
 *  =>예외처리 --> 순서가 있다.
 *    예외처리의 계층구조                        415페이지
 *            Object
 *               |
 *           Throwable
 *               |
 *          ===========
 *          |         |
 *       Error      Exception
 *                    |
 *               =====================
 *               |                   |
 *           (CheckException)        (UnCheckException)
 *               |                               |
 *             IOException                  RuntiomeException    
 *             =>파일,메모리,네트워크            NumberFromatException
 *             URLalformedException         NullPointerXception
 *             =>사이트주소틀린경우              ArithmeticException
 *             SQLException                 ArrayOutOfBoundException
 *             =>오라클관련
 *             ClassNotFoundException        
 *    
 *    예외처리 방법  416페이지
 *    ==========
 * *** =예외 복구  (try~catch) : 가장 많이 사용한다. -->직접처리 *****
 * *** =예외 회피  (throws) -->간접처리  *****
 *     =예외 만들기  (throw) : 예외던지기 배포할때 사용한다.
 *     =사용자 정의 예외 (자바에서 완벽하게 예외처리를 지원하지 않기때문)
 *       class MyException extends Exception
 *       
 *       
 *    예외처리 방법
 *    ==========
 *    목적:비정상종료를 방지하고 정상수행이 가능하게 만든다.
 *    정의:사전에 예상되는 에러를 방지하기 위한 방법론
 *    
 *    요구사항 분석 ==> 데이터베이스 설계 ==>데이터수집
 *         (사이트) ==>오라클
 *    ====화면 UI===========>구현======>테스팅===>배포(발표)
 *      ==>HTML/CSS      자바/JS              AWS
 *    요구사항 분석:어떤 에러가 발생할지(예상)
 *    
 *    예외처리 사용법
 *    1)직접처리 (예외복구) ->try~catch~finally(생략가능)
 *    try{
 *       정상수행이 가능한 소스(지금까지 코딩한 내용)
 *       --->에러발생
 *           프로그래머 실수, 사용자 실수
 *    }catch(예외처리의 종류){     <---여러번 사용이 가능(예상되는 에러 전부사용가능)
 *       --->에러처리 ==>복구
 *    }fianlly{
 *       정상수행, 비정상수행 상관없이 무조건 실행되는 문장  
 *       네트워크 서버 해제, 오라클 연결 해제  
 *    }
 *    문장  (수행여부)
 *    
 *    예시)
 *      try{
 *         1.사용자의 입력값 받기 (정수 2개)
 *         2.두개의 정수를 배열에 저장    [배열범위가 초과될수도]
 *         3.배열에 있는 정수를 나누기    [0으로 나눌수도]
 *         4.결과값을 출력
 *      }catch{                     [배열범위초과할경우]
 *         처리
 *      }catch{                     [0으로나눌경우]
 *         처리  --> 처리(원상복구)
 *      }finally{
 *         try,catch와 관계없이 무조건 수행하는 문장
 *      }
 *      
 *      public static void main(String[] args) {
 *            1)문장  --->수행
 *            2)문장  --->수행
 *         try{
 *            3)문장  --->수행
 *            4)문장  --->예외처리종류1발생 catch이동
 *            5)문장
 *         }catch(예외처리종류1){
 *            6)문장  --->수행
 *         }catch(예외처리종류2){
 *            7)문장
 *         }finally{
 *            8)문장  --->수행 (무조건 수행)=>생략이 가능하다.
 *         }
 *         9)문장   --->수행
 *         10)문장  --->수행
 *      }
 *         
 *      
 *      
 */   
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int[]arr = new int[2];
		arr[0] = 10;
//		arr[2] = 0;       //에러예상 배열범위초과
		arr[1] = 0;
		int result = arr[0]/arr[1];
		System.out.println(result);
		
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());		 //에러메세지출력	
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다!!");
//		}
//		System.out.println("프로그램 종료!!");	

		}catch(Exception e) {    //예외처리의 상위클래스 => 모든 예외 처리가능!!!
			System.out.println(e.getMessage());      //하지만 맨 앞에 가면 오류난다!!!               
		} 
		System.out.println("프로그램 종료!!");	
		                                               
//Throwable > Error, Exception > RuntimeException > ArrayIndexOutOfBoundsException,ArithmeticException   
		
	}

}
