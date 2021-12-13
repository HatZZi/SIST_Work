package sis.com.array;

import java.util.Random;

public class ArrayEx11 {
	int []m = new int [10];
	
	public void arraySet() {
		Random random = new Random();
		for (int i = 0; i<m.length; i++) {
			m[i] = random.nextInt(100);	
		}
		
		insertion(m);
	}
	
	public void insertion(int []x) {
		int temp = 0;
		for(int i = 1; i<x.length; i++) {
			for(int j = 0; j<x.length-1; j++) {
				if(x[i]<x[i-j])
				{
					temp = x[i];
					x[i] = x[i-j];
					x[i-j] = temp;
					
				}
			}
		}
		for(int i=0; i<x.length; i++) {
			System.out.println(m[i]);
		}
			
			
	}
	
	public static void main(String[] args) {
		ArrayEx11 a = new ArrayEx11();
		a.arraySet();
	}

}
