package sist.com.core.array;

import java.util.Scanner;

public class Array_Calender {
	
	Scanner sc = new Scanner(System.in);
	
	public void weekDay() {
		int year, month = 0;
		System.out.println("몇년도입니까?");
		year = sc.nextInt();
		System.out.println("몇월달입니까?");
		month = sc.nextInt();
		
		System.out.println(year + "년" + month + "월");
		
		int total = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		int []lastDay = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(year%4==0 && year%100!=0 || year%400==0) {
			lastDay[1]+=1;
		}
		
		for(int i = 0; i<month-1; i++) {
			total += lastDay[i];
		}
		total++;
		
		int week = total%7;
		String []weekName = {"일", "월", "화", "수", "목", "금", "토"};
		for(int i = 0; i<weekName.length; i++) {
			System.out.print(weekName[i]+"\t");
		}System.out.println();
		
		
		for(int i = 1; i<=lastDay[month-1]; i++) {
			
			if(i == 1) {
				for(int j = 0; j<week; j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				week =0;
				System.out.println();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Array_Calender a = new Array_Calender();
		a.weekDay();
	}

}
