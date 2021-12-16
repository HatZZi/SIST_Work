package com.sist.lib;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainClass8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d");
		String today = sdf.format(date);
//		System.out.println(today);
		StringTokenizer st = new StringTokenizer(today,"-");
		String strYear = st.nextToken();
		String strMonth = st.nextToken();
		String strDay = st.nextToken();
		
		int year = Integer.parseInt(strYear);
		int month = Integer.parseInt(strMonth);
		int day = Integer.parseInt(strDay);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("년도를 입력해주세요: ");
//		int year = sc.nextInt();
//		System.out.print("달을 입력해주세요: ");
//		int month = sc.nextInt();
		System.out.println(year+"년도 "+month+"월");
		System.out.println();
		String[]strWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		for(String week:strWeek) {
			System.out.print(week+"\t");  //요일명 차례로 출
		}
		System.out.println();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); //Calendar의 MONTH는 0~11까지이다.
		                                 //따라서 month가 12월이라면 MONTH의 12월은 11;
		cal.set(Calendar.DATE, 1);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);// 1~7
		int lastday = cal.getActualMaximum(Calendar.DATE);
		week = week-1;
		for (int i = 1; i <= lastday; i++) {
			if(i==1) {
				for (int j = 0; j < week; j++) {
					System.out.print("\t");
				}
			}System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				System.out.println();
				week=0;
			}
		}
	}

}
