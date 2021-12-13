package com.sist.exception;
//중복없는 난수 발생 ==>로또(1~45) =>6 =>예외처
public class MainClass6 {
	
	public static void main(String[] args) {
	//난수발생 => 일반
		int[]com = new int[6]; //결과값 저장 위치
		int su = 0;  //난수 저장하는 변수
		boolean bCheck = false; //중복여부 확인하는 변수
		//true = 중복, false = 중복아님
		for (int i = 0; i < 6; i++) {  //피망맞고
			//1. 중복여부 확인
			//2. 중복이면 ==>난수 다시발생
			//3. 중복이 아니라면 ==> com배열에 저장.
			bCheck = true;
			while(bCheck)
			{
				su = (int)(Math.random()*45)+1;
				//Math => random(), ceil():올림
				bCheck=false;
				for (int j = 0; j < i; j++) {
					if(com[j]==su) {   //중복된 숫자가 있는가?
						bCheck=true;
						break;
					}
				}
			}
			com[i] = su;
		}
		try {
			for(int i:com) {
				System.out.print(i+" ");
				Thread.sleep(500);
			}
		}catch(Exception e) {
			
		}
	}

}
