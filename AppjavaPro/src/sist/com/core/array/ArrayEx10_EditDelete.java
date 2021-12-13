package sist.com.core.array;

import java.util.Arrays;

public class ArrayEx10_EditDelete {

	int [][]m = new int[2][3];
	int row=0, col=-1;
	
	public boolean isEmpty() {
		return row==0 && col==-1;
	}
	
	public boolean isFull() {
		return row==m.length-1 && col==m[0].length-1; //헹의끝이고 열의 끝.
	}
	
	public void increment() {
	      int [][]imsi=new int[(m.length)*2][m[0].length];//[][][][][][][][][][]
	      for (int i = 0; i <m.length; i++) {
	    	  for(int j = 0; j<m[0].length; j++) {
	             imsi[i][j]=m[i][j];
	             
	    	  } 
	      }
	      m=imsi;
	}
	
	public int [] search(int data) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j]==data) return new int[]{i,j};
			}
		}
		return null;
	}
	
	public void add(int data) {
		if(isFull() )increment();
		if(col<m[0].length-1) {
			col++;
		}else {
			col = 0;
			row++;
		}
		m[row][col] = data;

	}
	

	public void modify(int origin, int change, int row, int col) {
		int []rs=search(origin,row,col);
		if (rs==null)return;
		m[rs[0]][rs[1]]
	}
	
	
	public void disp(int[][]m) {
		for(int []i:m) {
			System.out.println(Arrays.toString(i));
		}
	}

	public static void main(String[] args) {
		ArrayEx10_EditDelete a = new ArrayEx10_EditDelete();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(30);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(90);
		
		a.edit();
	}

}
