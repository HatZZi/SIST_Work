package com.sist.lib;
//java.lang, java.util
/*
 *  java.util => 프로그램에서 유용하게 사용되는 클래스 집합
 *  =========
 *  1. 난수 ==========>Random()------------>500page
 *  2. 문자열 분리 =====>StringTokenizer----->513page
 *  3. 날짜 ==========>Date, Calendar
 *  4. 변환 ==========>SimpleDateFormat, MessageFormat
 *  5. 집합(데이터수집)==>Collection
 *  6. 입력값 =========>Scanner  |
 *                             |
 *               --------------------------
 *               |            |            |
 *             List          Set          Map
 *               |            |            |
 *     ***** ArrayList     TreeSet      Hashtable
 *           Vector        HashSet      HashMap(*****) => 주로 코테에 나온다.
 *           LinkedList
 *           Stack             
 *  
 *  
 */
import java.util.Random; //권장 =>뒤에 별을 주면 모든클래스가 다 불러와짐
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수=> nextInt(30) ==> 0~29 
		Random r = new Random();
//		int i = r.nextInt();
//		System.out.println(i);
		int i = r.nextInt(100); // 0~99 (100제외)
		System.out.println(i);
		//실수 => nextDouble() ==>0.0~0.99
	}

}
