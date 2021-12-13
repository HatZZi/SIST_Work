package sis.com.array;

import java.util.Random;

public class Array_Quick {
	int []m = new int [10];
	
	public void makeArray() {
		Random rm = new Random();
		for (int i = 0; i < m.length; i++) {
			m[i] = rm.nextInt(45)+1;
			System.out.printf("%5d",m[i]);
		}
		makeQuick(m);
	}
	
	
	public void makeQuick(int[]m) {
		int pin = (int)(m.length/2);
		
		
		
	}
	
	
	public void disp() {
		
	}
	
	public static void main(String[] args) {
		Array_Quick a = new Array_Quick();
		a.makeArray();
	}

}
