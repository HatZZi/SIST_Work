package com.sist.exception;
//try~catch ==>메소드안, 생성자, 초기화블록, 클래스블록에서는 사용할수없다.
public class MainClass4 {
	//선언만 하는 영
	
	public static void main(String[] args) {
		//전체 예외처리
//		try {
			for (int i = 0; i <= 10; i++) {
				try {                          //for문 안에 try를 걸면 10번 돌긴 돈다.
				int j = (int)(Math.random()*3);
				int k = i/j;
				System.out.println("k="+k);
			}catch(Exception ex){
//		}catch(Exception ex) {
			System.out.println(ex.getMessage()); //에러메세지 출력
			}/*
			 * getMessage() =>실제 에러메세지만 출력
			 * printStackTrace => 에러난 부분 체크(줄 수)
			 */
//		}
	        }

     }
}
