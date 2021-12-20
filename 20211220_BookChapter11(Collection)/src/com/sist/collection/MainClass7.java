package com.sist.collection;
// Set, Map
/*
 *   Collection
 *     List ==> ArrayList
 *     ===============================================
 *     Set ==> HashSet, TreeSet
 *             =======
 *             ArrayList에 있는 데이터중에 중복이 없는 값 추출
 *             영화:장르, 맛집:음식종류
 *     Map ==> HashMap(Hashtable의 단점을 보완) Hashtable
 *             클래스 관리(컨테이너), 웹의 대부분의 클래 Map
 *             순서는 없고 키와 값 ==> cookie이용, session이용
 *     =====================출력시에 Iterator를 이용해서 출력하는 프로그램이 많다.
 *     
 *     Set => 인터페이스  (많이 사용하지는 않는다)
 *         구현하고 있는 클래스 : HashSet, TreeSet
 *         => 순서가 없고 데이터 중복을 허용하지 않는다. (ID)
 *         => 중복없는 데이터 : 정수
 *            ===========게시판(게시물번호), 회사원(사번), 학생(학번)
 *            ===========ID => 본인이 외워야한다.
 *         => 1)추가 : add(Object)
 *                    remove(Object)
 *                    clear()
 *                    size()
 *                    isEmpty()
 *              출력 : for-each, iterator 를 이용해서 처리
 */
import java.util.*;
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장공간을 만든다
		HashSet set = new HashSet(); //데이터 저장시 중복없는 데이터만 설정
		set.add("자바");
		set.add("오라클");
		set.add("HTML");
		set.add("CSS");
		set.add("JavaScript");
		set.add("JSP");
		set.add("Spring");
		set.add("최신기술:Spring-Boot,VueJS,ReactJS,AI");
		set.add("AWS:배포,리눅스");
		set.add("CSS"); //중복된 데이터는 아예 실행을 안한다
		System.out.println("=======for-each=======");
		for(Object obj:set) {
			System.out.println(obj);  // set은 주머니와 같아서 순서가 없다.
		}
		System.out.println("=======삭제 후=======");
		set.remove("자바");
		for(Object obj : set) {
			System.out.println(obj);
		}

	}

}
