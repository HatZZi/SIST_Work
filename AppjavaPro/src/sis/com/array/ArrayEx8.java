package sis.com.array;

import java.util.Arrays;

//석차, 최빈값.
public class ArrayEx8 {
	
	public void disp(int []m) {
		for (int i:m) {
			System.out.printf("%3d", i);
		}
		System.out.println();
	}
	
	public int arrayCount(int[]m) {
		int mx=0;
		for (int i = 0; i< m.length; i++) {
			if (mx<m[i]) {  //mx 0  10  mx 10 mx10 1
				mx=m[i];
			}
		}
		return mx;
	}
	
	public void mode(int []m) {        //m[10][1][1][1][1][5][5][5][5][9]
		int []c = new int [m.length];  
		for (int i = 0; i<m.length; i++) {
			for( int j=0; j<m.length; j++) {
				if (m[i]==m[j]) {
					c[i]++;
				}
			}
		}
		int temp=0;
		System.out.println("최빈값: ");
	      for (int i = 0; i < c.length; i++) {
	          if(c[i]==arrayCount(c)) {
	             if(temp!=0 && temp==m[i])continue;
	             System.out.print(m[i]+",\t");
	             temp=m[i];
	          }
	       }
//		System.out.println(arrayCount(m));
//		System.out.println(arrayCount(c));
//		System.out.println(Arrays.toString(m));
//		System.out.println(Arrays.toString(c));
	}
	
	public static void main(String[] args) {
		ArrayEx8 a = new ArrayEx8();
		int []m= {10,1,1,1,1,5,5,5,5,9};
		a.disp(m);
		a.mode(m);
	}

}
