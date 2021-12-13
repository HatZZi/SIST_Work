package sis.com.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx9_Select {
	Scanner sc = new Scanner(System.in);
	int []m = new int [10];
			
			
	public void initArray() {
		Random random = new Random();
		for(int i = 0; i<m.length; i++) {
			m[i] = random.nextInt(100);
			System.out.printf("%3d",m[i]);
		}	System.out.println();
	}
	
	public int setOrder() {
		System.out.println("오름차순으로 보려면 1번, 내림차순은 2번.");
		int order = sc.nextInt();
		return order;
	}
	
	public void makeArray() {
		int order = setOrder();
		int temp = 0;
		if(order==1) {
			for(int i=0; i<m.length-1; i++) {
				for(int j = i+1; j<m.length; j++) {
					if(m[i]>m[j]) {
						temp = m[j];
						m[j] = m[i];
						m[i] = temp;
					}
				}
			}
			for(int i=0; i<m.length; i++) {
				System.out.printf("%3d",m[i]);
			} return;
		}
		
		if(order==2) {
			for(int i=0; i<m.length-1; i++) {
				for(int j = i+1; j<m.length; j++) {
					if(m[i]<m[j]) {
						temp = m[i];
						m[i] = m[j];
						m[j] = temp;
					}
				}
			}
			for(int i=0; i<m.length; i++) {
				System.out.printf("%3d",m[i]);
			}
		} return;
	}
	
	public static void main(String[] args) {
		ArrayEx9_Select a = new ArrayEx9_Select();
		a.initArray();
		a.makeArray();
	}

}
