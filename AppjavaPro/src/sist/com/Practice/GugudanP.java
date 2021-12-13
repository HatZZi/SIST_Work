package sist.com.Practice;

import java.util.Scanner;

public class GugudanP {
	Scanner sc = new Scanner(System.in);
	public void getGuguVer() {
		for(int i=1; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				
					System.out.printf(j+"*"+i+"="+(j*i)+"\t");  //세로구구단
			
			}
			System.out.println();
		}
	}
	
	
	public void getGuguHor() {
		for(int i =2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf(i+"*"+j+"="+(i*j)+"\t");  //가로구구단
			}
			System.out.println();
		}
	}
	

	
	public void customGugu() {
		System.out.println("몇단?");
		int i =sc.nextInt();
		for(int k=1; k<=9; k++) {
			System.out.printf(i+"+"+k+"="+(i*k)+"    ");
		}
	}
	
	public void arrayGugu() {
		int []m = {1,2,3,4,5,6,7,8,9};
		for(int i=0; i<=m.length; i++) {
			for(int j=1; j<=m.length; j++) {
				System.out.printf(m[j]+"*"+m[i]+"="+(m[j]*m[i])+"\t"); //세로구구단       에러뜸체크!!!!!
			}
			System.out.println();
		}
		
	}
	
	public void whileGugu() {
		int i=0;
		int j=1;
		while(i++<=8) {
			while(j++<=8) {
				System.out.printf(j+"*"+i+"="+(j*i)+"\t");    // 세로구구단
				
			}
			j=1;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		GugudanP g = new GugudanP();
		g.whileGugu();
	}

}
