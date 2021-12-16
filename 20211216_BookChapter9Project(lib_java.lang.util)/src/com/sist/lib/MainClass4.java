package com.sist.lib;
//UPDOWN게임 ===>숫자야구게임
import java.util.*; //Scanner, Random => 예약일 지정
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 임의의 수를 저장 => 난수 => Random => 1~100
		int count = 0;
		Random r = new Random();
		int com = r.nextInt(100)+1; //1~100
		//2. 사용자가 입력해서 정답을 맞추기
		System.out.println("UPDOWN게임을 시작합니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100사이의 정수 입력: ");
		while(true) { //반복횟수를 모르는 경우 => 무한루프
			//사용자 입력 시작
			
			int user = sc.nextInt();
			if(user<1 || user>100) {
				System.out.println("잘못된 입력입니다.");
				continue;
				/*
				 * while ==> 조건식으로 이동
				 * for ==> 증가식으로 이
				 */
			}
			count++;
			//힌트를 주기 시작
			if(user<com) {
				System.out.println("UP");
			}else if(user>com) {
				System.out.println("Down");
			}else
				System.out.println("정답입니다! 짝!짝!짝!");
				System.out.println("입력 횟수: "+count);
			//정답여부 확인
		}
	}

}
