package com.sist.lib;

import java.util.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]com = new int[3];
		//중복없는 난수발생
		int su = 0;
		boolean bCheck = false; //중복여부 확인
		//중복이 있으면 난수 다시발생, 중복이 없으면 com에 저장
		//1~9 사이의 정수 발생 ==>nextInt(9)+1
		Random r = new Random();
		for (int i = 0; i < 3; i++) {
			bCheck = true;
			while(bCheck) {
				//난수 발생
				su = r.nextInt(9)+1;
				bCheck = false;
				for (int j = 0; j < i; j++) {
					if(com[j] == su) {
						bCheck=true; //중복이 있다면
						break; //while을 다시 수행
					}
				}
			}
			//while문을 빠져나오면 중복이 없다는 뜻
			com[i] = su;
		}
		//System.out.println(Arrays.toString(com));
		int[]user = new int [3];
		Scanner sc = new Scanner(System.in);
		while(true) {
			//사용자 입력
			System.out.println("세자리 정수 입력: ");
			int input = sc.nextInt();
			//오류처리 ==> ||  정상처리 ==> &&
			if(input<100 || input>999) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			//배열에 저장 345/100(3)
			user[0] = input/100;
			user[1] = (input%100)/10; //345%100 => 45/10 (4)
			user[2] = input%10;
			//중복된 수를 입력하면 안된다.
			if(user[0] == user[1] || user[1] == user[2] || user[2]==user[0]){
				System.out.println("중복된 수는 사용할 수 없습니다!!!");
				continue;
			}
			if(user[0] == 0|| user[1]==0 || user[2]==0) {
				System.out.println("0을 사용할 수 없습니다!!!");
				continue;
			}
			int s = 0; //자리수
			int b = 0; //숫자
			/*
			 * 345 => 378 ==>1S-0B
			 * 345 => 789 ==>0S-0B
			 * 345 => 456 ==>0S-2B 
			 */
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if(com[i]==user[j]) {  //같은 수가 있느냐?
						if(i==j) {  //같은 자리에 있다면
							s++;	
						}else b++;//다른자리에 같은수가 존재
					}
				}
			}
			System.out.printf("Input Number: %d, Result:%dS-%dB\n",input,s,b);
			//힌트
			//종료여부 확
			if(s==3) {
				System.out.println("GameOver!!");
				break; //종료 System.exit(0);
			}
			
		}
	}

}
