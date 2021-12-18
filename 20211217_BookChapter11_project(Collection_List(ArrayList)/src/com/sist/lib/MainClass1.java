package com.sist.lib;
/*
 *   라이브러리(9장~)
 *   ============
 *   9장 : java.lang ***** (자바 프로그램의 기본 라이브러리 => import생략이 가능)
 *         Object
 *            toString() : 문자열 변환
 *            => (String)형변환
 *            => toString() 
 *            clone():복제(참조/복제)
 *                    참조 : 같은 메모리를 이용
 *                    복제 : 새로운 메모리를 생성
 *            finalize() : 소멸자(객체가 메모리에서 사라질때 자동으로 호출되는 메소드
 *         String / StringBuffer
 *            =>문자열을 제어하는 클래스 (웹->문자열제어)
 *            =>문자열을 저장하는 방법
 *              String s = "Hello"; (문자열 자체가 메모리주소)
 *                         "Hello"가 가지고 있는 주소를 대입
 *              String s = new String("Hello");
 *                         새로운 메모리 생성 (new->새로운 메모리 생성)
 *            =>***java.lang에서 지원하는 클래스 대부분이 final클래스다
 *                     =>상속을 받을 수 없다(종단 클래스 => 확장해서 사용 금지)
 *                     =>있는 그대로 사용
 *                     =>String : char[]을 이용해서 만든 클래스다.
 *            =>문자열을 제어 할 수 있는 주요 기능(메소드)
 *              1)equals() => 실제 메모리에 저장되어있는 문자열 비교
 *                            로그인(id,password 비교)
 *                            아이디 중복체크
 *                            문자열을 ==을 사용하면 저장되어있는 주소값을 확인하는것
 *                            대소문자를 구분해서 비교
 *              2)검색 startsWith() :앞에 찾는 문자열이 같은지 여부
 *                                  쿠키, 본인 게시물, 서제스트(자동완성)
 *                    endsWith() : 뒤에 있는 문자열이 같은지 여부 확인
 *                    contains() : 검색어가 포함되어있는지 여부
 *                                 추천-> 오리LIKE %검색어%
 *                                       정규식(.*검색어*.)
 *                                       
 *                 ***자바 (역할 : 브라우저<--------------->오라클) 데이터를
 *                              화면에 출력              필요한 모아둔 곳
 *                              브라우저에서 오라클을 연결할 수 없다.
 *                              중간에 오라클을 연결해서 브라우저로 전송
 *                              매개역할 ==> 프로그램언어(자바)
 *              3)변환
 *                toUpperCase(): 대문자변환(알파벳)
 *                toLowerCase(): 소문자변환(알파벳)
 *                replace : 원하는 부분의 문자/문자열을 변경해서 사용
 *                          필요없는 부분을 제거
 *                          일반 문자/문자열을 설정
 *                          숫자를 지운다
 *                          replace('0',"")
 *                          replace('9',"")
 *                replaceAll : 원하는 부분의 문자/문자열을 변경
 *                             일반문자/문자열 설정, 문자열 형태
 *                             문자 형태를 가지고 찾는 경우(정규식)
 *                             replaceAll("[0-9]","")
 *                concat : 문자열 결합(사용빈도가 거의 없다) ==> +           
 *              4)찾기             
 *                indexOf() : 지정한 문자/문자열의 위치를 찾는 경우에 사용
 *                            문자열 => index가 0부터     
 *                lastIndexOf() : 지정한 문자/무자열의 위치를 찾는 경우에 사용
 *                                문자열 => index가 length()-1 
 *              5)문자 제어
 *                substring
 *                  => 오버로딩 : 같은 메소드명으로 여러개의 기능을 만드는 경우
 *                       =>매개변수의 갯수나 데이터형이 다른경우
 *                       substring(int begin)
 *                       String s = "Hellp Java!!"
 *                                   012345678910
 *                       s.substring(3)==> lo Java!!
 *                       subString (int begin, int end)
 *                       String s = "Hello Java!!"
 *                       s.substring(1,5) => ello
 *                                           마지막 end-1(제외)
 *                split
 *                   =>구분문자를 이용해서 자르는 역할(StringTokenizer)
 *                   =>자른 문자열을 배열로 모아서 넘겨준다
 *                   =>매개변수 -> 정규식
 *                length
 *                   =>문자의 갯수
 *              6) 기타
 *                  trim() : 좌우의 공백 제거
 *                           사용자 입력에서 실수(space)
 *                  valueOf() : 모든 데이터형을 문자열화 시키는 경우
 *                              웹 => 쿠키(저장되는 값이 문자열)                           
 *         Wrapper
 *             기본 데이터형을 관리하기 쉽게 클래스화 시킨 클래스의 모음
 *             int   ======>Integer 
 *                   parseInt("")->정수형으로 변경
 *                   ->웹  상세보기:해당 내용의 고유번호(중복이 안된 값:Primary Key)
 *                               문자열로 들어온다
 *                        페이지 나누기:페이지번호 -> 문자열로 들어온다
 *             long  ======>Long
 *                   parseLong("") -> Long형으로 변경
 *             double =====>Double
 *                   parseDouble("") -> 실수형으로 변경
 *             boolean ====>Boolean
 *             ==>문자열 => 해당 데이터형으로 변환
 *                   parseBoolean("")
 *         Math
 *            => 수학과 관련 메소드
 *            random() : 임의의 수 발생(난수)
 *                      => 0.0 ~ 0.99
 *            ceil() : 올림
 *         System
 *            =>System.out.println()
 *              System.in
 *              System.gc() : 메모리를 해제할때 사용(가비지컬렉션)
 *   10장 : java.util, java.text *****
 *     *****Random
 *            난수발생 : 임의의 수를 추출(게임) => 예약일, 예약시간
 *            nextInt() => int범위 (-21억 4천~ 21억 4천)
 *            nextInt(int bound) => bound는 범위
 *                    =========
 *                    예)nextInt(10) => 0~9사이의 정수 추출(마지막번호 제외)
 *     *****StringTokenizer
 *              =>문자열 별로 자르는 경우(split)
 *              =>생성자 2개(생성자 오버로딩)
 *              new StringTokenizer(구분할 문자열) => 공백별로 자른다
 *              new StringTokenizer(구분할 문자열, 구분자) => 구분자별로 자른다
 *              =>주요 메소드
 *                 countToken() : 자른 문자의 갯수
 *                 hasMoreToken() : 자를 문자열이 있는 여부 확인
 *                 nextToken() : 자른 문자열 호출
 *                               자른 문자열을 읽은 경우에 초과하면 오류가 발생
 *                               예) String words="aaa|bbb|ccc";
 *                                   StringTokenizer st = new StringTokenizer(words,"|")
 *                                   String s1 = st.nextToken();
 *                                   String s2 = st.nextToken();
 *                                   String s3 = st.nextToken();
 *                                   String s4 = st.nextToken(); //초과 오류발생
 *                               데이터 수집(|), 그림이 여러
 *     *****Date
 *          시스템의 날짜, 시간을 읽어온다(오라클과 호환)
 *          Date date = new Date()
 *     *****Calendar
 *          달력만들기, 요일 확인, 각 달의 마지막 날을 가지고 오는 경우
 *          => 추상클래스(인터페이스)->미완성 클래스 (메모리에 저장이 불가능)
 *                               시용자 정의 클래스를 만들어서 미완성된 메소드를 완성해서 사용
 *                               하위 클래스를 이용해서 주로 메모리 할당
 *                               관련된 클래스를 여러개 묶어서 사용
 *                               메소드가 정의가 없는 부분 (선언)
 *                               ***프로그램 : 한개의 이름으로 여러개를 제어
 *                               ***데이터 여러개 : 배열
 *                               ***클래스가 여러개 : 인터페이스
 *                               인터페이스 -> 서로다른 클래스를 연결해서 사용
 *                                          독립적으로 사용이 가능
 *                                          표준화가 가능하다
 *                               ***기술면접(스프링=>인터페이스기반)
 *                                  스프링(1. XML, 2.ANNOTATION, 인터페이스)
 *                                       1)XML => 설정
 *                                       2)ANNOTATION => 구분
 *                                       3)인터페이스 => 클래스 제어
 *          => 객체생성
 *             Calendar cal = Calendar.getInstance()
 *             1. 날짜 설정
 *                cal.set(Calendar.YEAR,2021)
 *                cal.set(Calendar.MONTH,month-1)
 *                cal.set(Calendar.DATE,17)
 *             2. 요일을 읽어온다(요일 : 1~7) => 0~6==> week-1
 *          Scanner : 키보드 입력값을 읽는 경우
 *                    정수 입력 : nextInt()
 *                    논리 입력 : nextBoolean()
 *                    문자열 입력 : next()=>공백전까지, nextLine()=> enter시 전체값 읽기
 *     *****SimpleDateFormat : 날짜를 원하는 형태로 변경
 *          =>년도 : yyyy
 *            월 : MM(M)
 *            일 : dd(d)
 *            시간 : hh(h)
 *            분 : mm(m)
 *            초 : ss(s)
 *            ============>대소문자 구분
 *     =============       
 *     ChoiceFormat
 *     MessageFormat
 *     =============  사용빈도가 거의 없다.
 *     *****데이터 베이스 연결(핵심) => JDBC (데이터베이스 : 표준화(SE:ECT...))
 *   11장 : java.util *****
 *         => Collection : 데이터를 모아서 브라우저로 한번에 전송
 *         => 컬랙션 프레임위크
 *                 ======== 표준화 (모든 개발자 동일형태로 코딩) => 가독성
 *                 =spring framework
 *         =>컬렉션 : 집합체(데이터 모아서 관리)
 *         => 다수의 데이터가 많은경우에 관리를 쉽게 해주는 역할
 *         => CURD : (Create, Update, Read, Delete)
 *                   데이터 저장, 데이터 수정, 데이터 읽기, 데이터 삭제
 *                   배열 불가능(삭제) => 고정, 컬렉션 가변
 *                   =============
 *                   고정=>증가(배열보다 큰 배열을 만들고 복사하여 저장하는 방식은 가능)
 *         => 기능별로 나눠져있다
 *             1. 순서가 있고 데이터의 중복을 허용
 *             2. 순서가 없고 데이터의 중복을 허용하지 않는다
 *             3. 키와 값으로 저장 (키는 중복허용않음, 값은 중복허용)       
 *             
 *             List (순서가 있고 데이터중복허용)
 *             1)ArrayList : 비동기화(데이터베이스 연결해서 사용)
 *               데이터 수집(데이터를 모아서 관리)
 *               =>주요 메소드(CURD)
 *               =>1. 추가 ->맨뒤에 추가
 *                          add(추가할 데이터(Object obj))
 *                              ========== 문자열, 클래스객체, 정수...
 *                              Object obj
 *                        ->원하는 위치에 추가
 *                          add(int index, Object obj)
 *                          ***Object(매개변수) => 모든 데이터를 첨부가능
 *               =>2. 수정 -> set(int index, 수정할데이터)
 *               =>3. 삭제 -> remove(int index)
 *               =>4. 읽기 -> get(int index)
 *               =>5. 저장갯수 -> size()
 *               =>6. 전체 삭제 -> clear()
 *             2)Vector : 동기화(네트워크 사용자 정보 저장)
 *                        =>ip,port
 *             3)LinkedList : C언어 호환
 *             4)Stack : LIFO => 나중에 들어온 데이터먼저 출력
 *                               주차장 시뮬레이션 (자료구조->코팅)
 *   12장 : 데이터형의 통일화(제네릭스) *****
 *   13장 : 쓰레드, 14장 : 람다/스트림
 *   15장 : 입출력 *****
 *   16장 : 네트워크
 *   584페이지
 *     1.ArrayList => 컬렉션중에 가장 많이 사용하는 컬렉션
 *     2.ArrayList => 순서가 있고, 데이터 중복 허용
 *     3.Vector(호환)보다는 ArrayList를 많이 사용
 *     4.사용처 : 데이터베이스, 파일 입출력, 데이터수집(크롤링)
 */
import java.util.*;
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ArrayList객체 생성
		ArrayList list = new ArrayList();  //단점은 모든 데이터가 오브젝트로 저장
		//index번호는 자동으로 생성 --> 0부터 시작(배열이니께)
		/*
		 * 홍길동 0
		 * 심청이 1
		 * 박문수 2
		 * 이순신 3
		 * 김두한 4
		 * 
		 * =>중간에 데이터 첨부 -->강감찬을 2번째에 넣고싶다?
		 * =>맨뒤에 추가(속도상의 문제가 없다)
		 * =>중간에 추가 (속도가 느려진다)
		 * 
		 * =>삭제 -->심청이를 삭제하고싶다?
		 * 자동으로 인덱스번호가 삭제에 맞추어 재정리된다.
		 * 인덱스 번호는 ArrayList자체에서 자동 처리 => 0번부터 순차적으로 유지
		 * 반복문을 수행하기 쉽게 인덱스 번호가 자동조절된다.
		 */
		//오브젝트로 저장되면 => 값을 읽어올때 반드시 형변환을 해야한다.->for-each사용 불가
		//2. ArrayList 저장(맨뒤에 추가) -->add(데이터)
		//3. ArrayList 저장(원하는 위치에 추가) -> add(index번호, 데이터)
		//4. ArrayList 저장된 데이터 읽기 -->get(index번호)
		//5. ArrayList 저장된 갯수 확인 --> size()
		//6. ArrayList 저장된 데이터 수정 --> set(index번호데이터)
		//7. ArrayList 저장된 데이터 삭제 --> remove(index번호
		//8. ArrayList 저장된 데이터 전체삭제 --> clear()
		
		//이름 추가
		list.add("홍길동"); //데이터는 어떤 데이터형이든 관계가 없다
		//       ====== Object가 설정 (Object는 모든 데이터형을 받아서 관리)
		list.add("심청이");//1
		list.add("김두한");//2
		list.add("강감찬");//3
		list.add("박문수");//4
		//출력
		for (int i = 0; i < list.size(); i++) {
			//0부터 데이터를 읽기 시작
			String name = (String)list.get(i);
			System.out.println(i+name);
			//원형 : Object get(int index)
			//형변환 --> 원래는 Object로 되어있는데, Object는 가장 큰 데이터형이다.
			//왼쪽편이 크거나 같으면 형변환을 하지 않는다.
			//오른편이 크면 반드시 형변환을 해야한다.
			//매번 형변환이 어려울수있다.
			//Object아닌 원하는 데이터형으로 변환 => 제네릭스
			//ArrayList<String>
			//<Type:class> => ArrayList
		}
		//2.원하는 위치에 추가 (인덱스번호가 어떻게 변경되는지 보자)
		//인덱스 번호는 항상 0번부터 순차적으로 유지한다
		System.out.println("======원하는 위치에 데이터 추가======");
		list.add(2,"이순신");
		//출력
		for (int i = 0; i < list.size(); i++) {  //범위를 벗어나면 오류 발생(저장된 갯수만큼)
			String name=(String)list.get(i);
			System.out.println(i+"."+name);
		}
		//***속도를 최적화 => 맨뒤에 추가하면 속도가 덜 느려진다. =>add()가 사용빈도가 많다.
		//3.수정 ==> 1에 등록된 심청이를 춘향이로 변경해보자
		System.out.println("=====데이터 변경=====");
		list.set(1, "춘향이");
		for (int i = 0; i <list.size(); i++) {
			String name = (String)list.get(i);
			System.out.println(i+name);
		}
		
		//삭제 =>3김두한 탈퇴
		System.out.println("=====데이터 삭제=====");
		list.remove(3);
		//***Arraylist => 메모리에 저장되어있기 때문에 프로그램이 종료하면 사라진다.
		//유지가 가능하게 만들려면 파일,오라클(영구적으로 저장)
		for (int i = 0; i < list.size(); i++) {
			String name = (String)list.get(i);
			System.out.println(i+name);
		}
		
		//CURD프로그램(추가,수정,삭제,읽기) => 데이터베이스 (데이터 저장후 관리)
		//=>메모리(데이터를 저장하는 장소)
		//변수,배열,클래스,컬렉션,파일,RDBMS(오라클)
		System.out.println("=====데이터 전체삭제=====");
		list.clear();
		for (int i = 0; i < list.size(); i++) {
			String name = (String)list.get(i);
			System.out.println(i+name);
		}
		
		/*
		 * ArrayList
		 * =추가 add()
		 * =갯수 size()
		 * =수정 set()
		 * =삭제 remove()
		 * =읽기 get()
		 */
		//배열이용
		System.out.println("=====배열을 ArrayList로 바꾸기=====");
		String[]names = {"홍길동","이순신","강감찬","을지문덕","박문수"};
		List<String> nameList = Arrays.asList(names);
		for(String name:nameList) {
			System.out.println(name);
		}
		Object[] n = nameList.toArray();
		for(Object o:n) {
			System.out.println(o);
		}
	}

}
