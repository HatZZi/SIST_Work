package com.daily.test;

public class No3 {
	
	public void makeArr() {
		int[]arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전: ");
		for(int n:arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		makeOrderUP(arr);
		makeOrderDOWN(arr);
	}
	
	public void makeOrderUP(int[]arr) {
		System.out.println("오름차순 정렬");
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[i]<arr[j]) {
					int tmp = 0;
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		disp(arr);
	}
	
	public void makeOrderDOWN(int[]arr) {
		
		System.out.println("내림차순 정렬");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp = 0;
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		disp(arr);
	}
	
	public void disp(int[]arr) {
	
		for(int n:arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No3 thr = new No3();
		thr.makeArr();
	}

}
