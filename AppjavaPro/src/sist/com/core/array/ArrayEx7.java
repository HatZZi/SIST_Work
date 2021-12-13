package sist.com.core.array;

import java.util.Iterator;

public class ArrayEx7 {
	
	public void disp(int [][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d",m[i][j]);
			}
			System.out.println();
		}
	}
	
	public void sum(int[][]m) {
		for(int i=0; i<m.length-1; i++) {
			for(int j=0; j<m.length-1; j++) {
				 m[i][m.length-1] += m[i][j]; 
				 m[m.length-1][i] += m[j][i]; 
			}
			m[m.length-1][m.length-1] += m[i][i];
		}
		
		disp(m);
	}
	
	
	
	public void move(int[][]t) {
		int [][]newArray = new int [3][4];
	
		for(int i=0; i<newArray.length; i++) {
			for(int j =0; j<newArray[i].length; j++) {
				if(i==0) {
					if(i+j<3) {
						newArray[i][j] = t[i][j];
					}
					else {
						newArray[i][j] = t[i+1][j-3];
					}
				}
				if(i==1) {
					if(i+j<3) {
						newArray[i][j] = t[i][j+1];
					}
					else {
						newArray[i][j] = t[i+1][j-2];
					}
				}
				if(i==2) {
					if(i+j<3) {
						newArray[i][j] = t[i][j+2];
					}
					else {
						newArray[i][j] = t[i+1][j-1];
					}
				}

			
						
			}
		}
		disp(newArray);
	}
	
	
	public static void main(String[] args) {
		ArrayEx7 a = new ArrayEx7();
		
		int[][]m = {{10,20,30,0},
				    {40,50,60,0},
				    {70,80,90,0},
				    {0,0,0,0}};
//		a.sum(m);
		
		int [][]t = {{1,2,3},
				     {4,5,6},
				     {7,8,9},
				     {10,11,12}};
		a.move(t);
		}
		//a.disp(m);
	}

