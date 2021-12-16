package com.sist.lib;
/*
 *   1. 웹개발자(자바)
 *      = 변수,연산자,제어문,메소드,클래스,인터페이스
 *            ==== ====if,for,while,break
 *           증감,부정,산술,비교,논리,대입
 *      = 예외처리(예외복구try~catch,예외회피throws)
 *      = 라이브러리
 *        =======
 *        java.lang
 *         : String, StringBuffer, Wrapper(데이터형을 클래스화),Math
 *        java.util
 *         : StringTokenizer, Calendar, Date, List, Map
 *                                            =========Collection
 *        java.io
 *         : FileInputStream, FileOutputStream, BufferReader, File
 *          (FileReader)      (FileWriter)
 *        java.text
 *         : SimpleDateFormat
 *        java.net
 *         : URL, URLEncoding, Socket, ServerSocket
 *        =========================================================
 *        java.sql   (오라클 관련)
 *         : Connection, Statement, ResultSet
 *        =========================================================
 *        ==> 디자인 패턴
 *        ==> 알고리즘 (코테)
 *        
 *        ==>490페이지
 *           레퍼클래스(Wrapper)
 *           =>일반 데이터형을 클래스화 시켜서 쉽게 제어할 수 있게 하는것
 *           데이터형                          클래스(레퍼클래스)
 *           ------                           -----------
 *           정수형 (1byte=>8bit)           ======>Byte
 *             byte (1byte)=>-128~127
 *             =>네트워크, 파일 입출력에 사용
 *             short (2byte)=>-32768~32767 =====>Short
 *             => C언어 호환
 *             int (4byte)           ===========>Integer *****
 *             long(8byte)           ===========>Long
 *           문자형
 *             Unicode VS ASC
 *             char (2byte)    =================>Character
 *           실수형
 *             float (4byte)=>f (6자리)   =======>Float
 *             double(8byte)=>d(생략) (15자리)  ==>Double *****
 *           논리형
 *             boolean (1byte) => true/false ===>Boolean *****
 *         =========================================================  
 *          오토박싱 Vs 언박싱
 *          Integer i = 10=> 오토박싱
 *          Integer i = new Integer(10);
 *          int j = i; =>언박싱
 *         =============================
 *         Object o = 10
 *         Object o = 10.0
 *         Object s = ""
 *         Object s = 'A'
 *         Object s = true
 *         Object s = new A()
 *         
 *         *** 웹 (문자열) ==> 원하는 데이터형으로 변경
 *         "10", "10.5", "true"
 *         ing i = Integer.parseInt("10"); //문자열을 정수형으로 변환
 *         double d = Double.parseDouble("10.5")
 *         boolean b = Boolean.parseBoolean("true")
 *         
 *         i = 10;    String.valueOf(i) ==> "10"
 *         d = 10.5;  String.valueOf(d) ==> "10.5"
 *         b = true;  String.valueOf(b) ==> "true"
 *         
 *         => 문자열 ==> String.valueOf() 모든 데이터형을 문자로 변환
 *         => 일반 데이터형 ==> parse~~~() 문자열을 원하는 데이터형으로 가능
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 => 문자열(웹)
		//=> 발생할 수 있는 에러 => NumberFormatException
		//브라우저에서 전송 => list.jsp?page=1 ==>String page ="1"
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 문자열 입력: ");
		String num1 = sc.next();
		System.out.print("두번째 문자열 입력: ");
		String num2 = sc.next();
		
//		int i = Integer.parseInt(num1); //문자열을 정수형으로 변환!
//		int j = Integer.parseInt(num2);
//		double d1 = Double.parseDouble(num1);  //문자열을 실수형으로 변환!
//		double d2 = Double.parseDouble(num2);
//		System.out.println("=========더한 결과값=========");
//		System.out.println(i+j);
//		System.out.println(d1+d2);
		
		boolean b1 = Boolean.parseBoolean(num1);
		boolean b2 = Boolean.parseBoolean(num2);
		System.out.println(b1);
		System.out.println(b2);

	}

}
