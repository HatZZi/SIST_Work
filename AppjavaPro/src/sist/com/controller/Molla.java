package sist.com.controller;

import java.util.Scanner;

public class Molla {
	
	Scanner scanner = new Scanner(System.in);
	
	int age = 0;
	int month = 0;
	int date = 0;
	int allDates = 0;
	int birthYear = 0;
	int yunD = 0;
	int TYD = 0;
	
	public void thisYearDays() {
		System.out.println("몇년에 태어났습니까?");
		int birthYear= scanner.nextInt();
		System.out.println("몇월에 태어났습니까?");
		int month = scanner.nextInt();
		System.out.println("몇일에 태어났습니까?");
		int date = scanner.nextInt();
		
		int i = 0;
	
		
		for(i=1; i<=month-1; i++) {  //
			
			for(i=1; i<=month-1; i++) {  //
				if(i<=7) {
				
				if(i%2==0) {   //짝수달
					if(i==2) {
					TYD+=28;
					}
					else {
					TYD+=30;}
				}
				else {
					TYD+=31;
				}
			    
			}else {
				
					if(i%2==0) {
						TYD+=31;
					}
					else {
						TYD+=30;
					}
				
		
			}
			
			
		}System.out.println(TYD+date);
		}
	}
	
		public static void main(String[] args) {
			Molla m = new Molla();
			m.thisYearDays();
		}
		
}