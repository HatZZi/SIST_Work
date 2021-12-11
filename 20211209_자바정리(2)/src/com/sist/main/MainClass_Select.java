package com.sist.main;

import java.util.Arrays;

//제어문 사용 
//메소드
//객체 지향 => 내부클래스
//오류없는 프로그램 (예외처리)
//1장~8장  
//단일 조건문  1~100까지 == 3배수 5배수 7배수의 합을 구해
//다중 조건
//포함 : &&  ==>페이징할때 자주 사용   
//미포함 : || ==> 

public class MainClass_Select {

	public static void main(String[] args) {
		//정렬:선택정렬 , 버블정렬   <웹사이트에선 안쓴다. 웹에서는 ORDER BY no DESC>
		int []arr = {45,67,90,34,12};
		Arrays.sort(arr);    //ASC(올림차순). DESC(내림차순)
		for(int i :arr) {
			System.out.print(i + " ");
		}
		System.out.println("\nDESC");
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {         //내림차순     arr[i]>arr[j] 올림차순  
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
