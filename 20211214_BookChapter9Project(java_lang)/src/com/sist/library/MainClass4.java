package com.sist.library;
//charAt
//문자열을 입력받아서 문자가 좌우 대칭여부 확인하는 프로그램
//ABBA
//=>구글 코테
//=>그림을 거꾸로 출력해라
import java.util.*;
//1.length()=>문자갯수 (오류처리) ==> 문자열이 짝수여야한다.
//2.charAt()=>
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 입력 받기
		Scanner sc = new Scanner (System.in);
		System.out.print("문자열 입력: ");
		String s = sc.next();
		
		if(s.length()%2==0) {
			//System.out.println("정상 수행이 가능합니다!!");
			boolean bCheck = true;  // 반복문에서 비교할때는 디폴트설정을 실행해둬라!
			for (int i = 0; i < s.length()/2; i++) {
				char f = s.charAt(i); //앞에서부터
				char e = s.charAt(s.length()-1-i); //뒤에서부터
				//System.out.println(f+"|"+e);
				if(f!=e) {   //같은문자가 아니면 종료
					bCheck = false;
					break;
				}
			}
			if(bCheck==true) {
				System.out.println("좌우대칭 입니다!!");
			}
			else {
				System.out.println("좌우대칭이 아닙니다!!");
			}
		}else {
			System.out.println("입력한 문자 갯수가 짝수여야 합니다!!");
		}
	}

}
