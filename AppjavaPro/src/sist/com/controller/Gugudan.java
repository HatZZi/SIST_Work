package sist.com.controller;

public class Gugudan {
	
	public void looping1() {   //가로로 구구단식 
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			} System.out.println();
		}
	}
	
	public void looping2() {   //세로로 구구단식 
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			} System.out.println();
		}
	}
	
	public void looping3() {
		int i=2;
		int j=1;
		while(i++<=9) {
			while(j++<=9) {
			System.out.print(i +"*"+j+"="+(i*j)+"\t");	
			if(j>9) {
				j=0;
			}
			} 
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Gugudan g = new Gugudan();
		g.looping3();
		
	}

}
