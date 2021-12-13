package sis.com.array;

import java.util.Random;

public class Array_Insertion {
	int []m = new int[5];
	
	public void makeArray() {             //랜덤 5개짜리 배열 생
		Random random = new Random();
		for (int i=0; i<m.length; i++) {
			m[i] = random.nextInt(100);
		}
		for (int i=0; i<m.length; i++) {
			System.out.printf("%3d",m[i]);
		}System.out.println();
	}
	
	public void insertion() {            //삽입정렬..
		for(int i=1; i<m.length; i++) {
			while(m[i]<m[i-1]) {
				int temp = 0;
				temp = m[i];
				m[i] = m[i-1];
				m[i-1] = temp;
				i--;
				if(i==0)break;
			}
		}
		for(int i = 0; i<m.length; i++) {
			System.out.printf("%3d",m[i]);
		}
	}
	
	public static void main(String[] args) {
		Array_Insertion a = new Array_Insertion();
		a.makeArray();
		a.insertion();
	}

}
