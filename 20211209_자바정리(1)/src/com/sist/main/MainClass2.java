package com.sist.main;

import java.util.Iterator;

//배열 초기화
// new이용
// int[]arr = new int[5]  ==>0
// double[]arr = new double[5] ==>0.0
// String[]arr = new String[5] ==>null (저장주소가 없는 경우) 
public class MainClass2 {
	
	public static void main(String[] args) {
		int[]arr = new int [10];//0
		//값변경
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;  //(Math.random() : 0.0~0.99)
		}
		//출력
		for(int i:arr) {   //arr이라는 배열에서 실제의 값을 가지고와서 i에 대입
			System.out.println(i);;
		}
		
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
