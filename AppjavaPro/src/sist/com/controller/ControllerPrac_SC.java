package sist.com.controller;

import java.util.Scanner;

public class ControllerPrac_SC {
	Scanner scanner = new Scanner(System.in);
	
	public void withBall() {
		System.out.println("어떤 공놀이? 1.축구 2.야구 3.볼링");
		int state= scanner.nextInt();
		
		
		if(state==1) {
			System.out.println("축구는 재미있어!");
		}
		else if(state==2) {
			System.out.println("야구는 재미있어!");
		}
		else if(state==3){
			System.out.println("볼링은 재미있어!");
		}
		else {
			System.out.println("다시 말해줄래?");
		}
		
	}
	public void withStr() {
		String num=null;
		while(true) {
		do {
			System.out.println("줄넘기 몇개 가능해? 100개? 50개?");
			num=scanner.next();
			}while(!(num.equals("100개") || num.equals("50개"))); 
		
		if(num.equals("100개")) {
			System.out.println("대단해!");
			break;
		}
		else {
			System.out.println("노력하자!");
			return;
			
		}
	} System.out.println("줄넘기는 재미있어!");
	}
	
	
	public void playWith(){
		while(true) {
			System.out.println("뭐하고 놀까? 1.공놀이 2.줄넘기 3.안해");
			switch(scanner.nextInt()) {
			case 1:
				withBall();return;
			case 2:
				withStr(); return;
			case 3:
				System.out.println("다음에 놀자!");return;
			default : System.out.println("다시 말해줄래?");
			}
		}
	}
	
	
	public static void main(String[] args) {
		ControllerPrac_SC c = new ControllerPrac_SC();
		c.playWith();
	}

}
