package sis.com.array;

import java.util.Random;
//버블정렬 
public class ArrayEx10 {
	int []m = new int [10];
	
	public void arraySet() {
		Random random = new Random();
		for (int i = 0; i<m.length; i++) {
			m[i] = random.nextInt(100);	
		}
		
		bubble(m);
	}
	
	public void bubble(int []x) {
		
		int temp = 0;
		for(int i = 0; i<m.length-1; i++) {
			for (int j = 0; j<m.length-(i+1);j++) {
				if (m[j]>m[j+1]) {
					temp = m[j+1];
					m[j+1] = m[j];
					m[j] = temp;
				}
			}		
			}
	
		
		for (int i= 0; i<m.length; i++) {
			System.out.println(m[i]);
		}		
	}
		
	public static void main(String[] args) {
		ArrayEx10 a = new ArrayEx10();
		a.arraySet();
	}

}
