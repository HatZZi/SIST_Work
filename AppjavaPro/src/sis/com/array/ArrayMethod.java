package sis.com.array;

import java.util.Arrays;

public class ArrayMethod {
	
	public void arrayCopyEx1() {
		int []a = {10,20,30,40,50};  //[10][20][30][40][50]
		int []b = new int [a.length*2];//[20][30][40][50][0][][][][][]
		
		System.arraycopy(a, 1, b, 0, a.length-1);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
	public void arrayCopyEx2(int []x) {  //[10][20][30][40][50]
		int []imsi = new int [x.length]; //[] [] [] [] []
		for (int i = 0; i<x.length; i++) { //[50] [40] [30] [20] [10]
			imsi[i]=x[x.length-(i+1)];     
		}
		
		System.arraycopy(imsi, 0, x, 0, imsi.length);   //x는 지역변수이기때문에 arraycopy로 m이 가리키는 주소값이 x주소값이 되도록 덮어쓰기.
	}
	
	
	public static void main(String[] args) {
		ArrayMethod a = new ArrayMethod();
		int []m = {10,20,30,40,50};// [10][20][30][40][50]
		a.arrayCopyEx2(m);
		System.out.println(Arrays.toString(m));
	}

}
