package com.sist.lib;
import java.util.*;
import java.text.*;
/*
 * 1. Random() => nextInt(n) => n은 제외
 * 2. StringTokenizer
 *    값읽기=>nextToken
 *    반복=>hasMoreTokens
 *    갯수=>countTokens
 * 3. Date, Calendar => 달력
 * 4. Format
 * ====================================
 * List
 */
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오늘 날짜 가져오기
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//MM / dd는 01, 02 이렇게 앞에 0을 붙여서 두자리로 출력한다. 08,09는 오류남.8진법.
		//M / d는 10 이하일때 1자리 출력
		// (0=>8진법, 0x=>16진법, 0b=>2진법)
		System.out.println(sdf.format(date));
		StringTokenizer st = new StringTokenizer(sdf.format(date),"-");
		System.out.println("년도: "+st.nextToken());
		System.out.println("월: "+st.nextToken());
		System.out.println("일: "+st.nextToken());
	}

}
