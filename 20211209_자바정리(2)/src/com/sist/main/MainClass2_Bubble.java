package com.sist.main;

import java.util.Arrays;

//버블정렬
public class MainClass2_Bubble {
	
	public static void main(String[] args) {
		int []arr = {45,67,90,34,12};
		System.out.println("정렬 전 :");
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]<arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
		System.out.println("정렬 후 :");
		System.out.println(Arrays.toString(arr));
	}

}
