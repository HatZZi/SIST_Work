package sist.com.core.array;

import java.util.Arrays;
import java.util.Random;

//다차원
public class ArrayEx5 {
	
	public void arrayEx1() {
		int[][]m = new int[2][3];  //[][][]
		                           //[][][]
		Random rm = new Random();
		for (int i = 0; i < m.length; i++) {  //행
			for (int j = 0; j < m[i].length; j++) {  //열	
				m[i][j] = rm.nextInt(10);
				//System.out.printf("%5d",m[i][j]);
			}
			//System.out.println();
		}
		disp3(m);
	}
	
	public void disp(int [][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d",m[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	public void disp2(int [][]m) {
		for (int []i:m) {
			for(int j:i) {
				System.out.printf("%5d", j);
			}
			System.out.println();
		}
		
	}
	
	public void disp3(int [][]m) {
		for(int []i:m) {
		System.out.println(Arrays.toString(i));
		}
	}
	
	public void arrayEx2() {
		int []a = {10,20,30,40,50};
		int [][]b = {{10,20,30},{40,50,60}};
	}
	
	public static void main(String[] args) {
		ArrayEx5 a = new ArrayEx5();
		a.arrayEx2();
	}

}
