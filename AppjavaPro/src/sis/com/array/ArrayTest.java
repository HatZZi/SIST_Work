package sis.com.array;

import java.util.Scanner;

public class ArrayTest {
	Scanner sc = new Scanner(System.in);
	
	public int[] arrayEx() {
		
		System.out.println("몇개의 숫자를 입력하시겠습니까?.");
		int input1 = sc.nextInt();
		int []m = new int [input1];
		System.out.println(input1+"개의 숫자를 입력하시오.");
		
		for(int i=0; i<input1; i++) {
			int input2 = sc.nextInt();
			m[i] = input2;
			
		}
		for (int i=0; i<m.length; i++) {
			
		}
		
		
		return m;
        
	}
	
	public void MaxV() {
		int []A = arrayEx();
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		
		for (int i=0; i<A.length; i++) {
			if (A[i]>max) {
				max = A[i];
			}
		} System.out.println("최댓값은 "+max+"입니다!");
		
		for (int i=0; i<A.length; i++) {
			if (A[i]<min) {
				min = A[i];
			}
		} System.out.println("최솟값은 "+min+"입니다!");
		
		System.out.println("얼마와 가까운 숫자를 구하시겠습니까?");
		int close = sc.nextInt();
		
		int diff = Integer.MAX_VALUE;
		
		for (int i=0; i<A.length; i++) {
			if (Math.abs(A[i]-close) < diff) {
				diff = A[i];
			}
		}System.out.println(close+"의 근사값은 "+diff+"입니다.");
		
	}
	
	public void order() {
		int []A = arrayEx();
	}
	
	
	
	
	
	public static void main(String[] args) {
		ArrayTest a = new ArrayTest();
		a.MaxV();
		
		
		
	}

}
