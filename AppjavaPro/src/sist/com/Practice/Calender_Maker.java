package sist.com.Practice;

import java.util.Calendar;
import java.util.Scanner;

public class Calender_Maker {
	Scanner sc = new Scanner(System.in);
	int year = Calendar.getInstance().get(Calendar.YEAR);
	int month = Calendar.getInstance().get(Calendar.MONTH)+1;
	int day = Calendar.getInstance().get(Calendar.DATE);
	int BirthDate = 0;
	int BirthMonth = 0;
//	String thisDate = null;
//	String thisMonth = null;
	String id = null;
	public void toDayCal() {
		
		System.out.println("오늘은 "+year+"년 "+month+"월 "+day+"일 입니다.");
		System.out.println("주민등록번호를 입력해주세요.");
		id = sc.next();
	}

	public void idInput() {
		String []idSplit = id.split("-");
		String birthDay = idSplit[0].substring(2, 6);
		BirthDate = Integer.parseInt(birthDay.substring(2, 4));
		BirthMonth = Integer.parseInt(birthDay.substring(0, 2));
//		System.out.println(BirthDate);
//		System.out.println(BirthMonth);
//		
		
	}
	
	public void makeCal() {
		int total = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		int []lastDay = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(year%4==0 && year%100!=0 || year%400==0) {
			lastDay[1]+=1;
		}
				
		for (int i = 0; i < month-1; i++) {
			total += lastDay[i];
		}
		total +=1;
		
		int weekDay = total%7;
		
		String []weekName = {"일" , "월" , "화", "수", "목", "금", "토"};
		
		for (int i = 0; i < weekName.length; i++) {
			System.out.printf(weekName[i]+"\t");
		}
		System.out.println();
		
		for (int i = 1; i <= lastDay[month-1]; i++) {
			
			if(i == day) {
				System.out.printf("(%d)\t",i);
			}
		
			
			if(i==BirthDate && month==BirthMonth) {
				System.out.printf("생%d일\t",i);
			}
			if(i==1) {
				for (int j = 0; j < weekDay; j++) {
					System.out.print("\t");
				}
			}
			if(i!=day) {
				if( i != BirthDate && month == BirthMonth) {
			System.out.printf("%2d\t",i);
			}
			}
			weekDay++;
			if(weekDay>6) {
				weekDay = 0;
				System.out.println();
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		Calender_Maker c = new Calender_Maker();
		c.toDayCal();
		c.idInput();		
		c.makeCal();
	}

}
