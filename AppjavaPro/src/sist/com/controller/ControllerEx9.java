package sist.com.controller;

import java.util.Scanner;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class ControllerEx9 {
	Scanner scanner = new Scanner(System.in);
	
	int age = 0;
	int month = 0;
	int date = 0;
	int allDates = 0;
	int birthYear = 0;
	int yunD = 0;
	int cdate = 0;

	/*public int yunDal() {
		
		for(int k=1; k<=birthYear; k++) {
			if(k%4==0 && k%100!=0 && k%400==0) {
				yunD+=1;
			}
			else {
				yunD+=0;
			}
		}*/
		/*if( birthYear !=0 && birthYear%4==0 && birthYear%100!=0 || birthYear%400==0 ) {
			yunD+=1;
		}
		
		return yunD;
	}*/
	
	public int thisYearDays() {
		
		 for(int i=1;1<=birthYear-1;i++) {
	         if(i%4==0 && i%100!=0)
	            cdate+=366;
	         else
	            cdate+=365;
	         }
	      
	      //월별 일수 총합 계산
	      for(int i=1;i<month-1;i++) {
	      switch(i)
	         {
	         case 2:
	            
	         if (birthYear%4==0 && birthYear%100!=0 && birthYear%400==0)
	            cdate+=29;
	         else
	            cdate+=28;
	         break;
	         case 4:
	         case 6:
	         case 9:
	         case 11:
	            cdate+=30;
	         break;
	         default:
	            cdate+=31;
	            }
	      }

	      return cdate;	
		}
			

	

	
	public void calAnimal() {
		String animal = null;
		String day = null;
		int thisYearDays = 0;
		System.out.println("몇년에 태어났습니까?");
		int birthYear= scanner.nextInt();
		System.out.println("몇월에 태어났습니까?");
		int month = scanner.nextInt();
		System.out.println("몇일에 태어났습니까?");
		int date = scanner.nextInt();
		        
		switch(birthYear%12) {
		case 1: animal = "닭";break;
		case 2: animal = "개";break;
		case 3: animal = "돼지";break;
		case 4: animal = "쥐";break;
		case 5: animal = "소";break;
		case 6: animal = "호랑이";break;
		case 7: animal = "토끼";break;
		case 8: animal = "용";break;
		case 9: animal = "뱀";break;
		case 10: animal = "말";break;
		case 11: animal = "양";break;
		case 12: animal = "원숭이";break;
		}
		System.out.println(animal+"띠");	
		
        age = 2022- birthYear;
		System.out.println(age+"살");
	
		
		
		int allDays = (birthYear-1)*365 + cdate ;
		 
		switch(allDays%7) {
		case 1: day = "월요일";break;
		case 2: day = "화요일";break;
		case 3: day = "수요일";break;
		case 4: day = "목요일";break;
		case 5: day = "금요일";break;
		case 6: day = "토요일";break;
		case 0: day = "일요일";break;
		
		}
		System.out.println(day);
	}
	
	
	public static void main(String[] args) {
		ControllerEx9 c = new ControllerEx9();
		c.calAnimal();
		
		
	}
}
