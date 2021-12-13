package sist.com.core.array;

import java.util.Arrays;

public class DemoEx2_searchDelete {
	
	int[][]m = {{10,20,30},{40,50,60},{70,80,90}};
	
	public int []search(int data){
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j]==data)
				return new int[] {i,j};
			}
		}
		return null;
	}
	
	public int []search(int data, int row, int col){
		for (int i = row; i < m.length; i++) {
			for (int j = col>(m[i].length-1)?0:col; j < m[i].length; j++) {
				System.out.println("row=" +i+ " col=" +j+ " ="+m[i][j]);
				if(m[i][j]==data)
					return new int[] {i,j};
			}
			col=0;
		}
		return null;
	}
	
	public void delete(int data) {
		int[]rs = search(data);
		for(int i=rs[0]; i<m.length; i++) {
			for(int j=rs[1]; j<m[i].length; j++) {
				if(i==m.length-1 && j==m[i].length-1) {
					m[i][j]=0; break;
				}
				if(j==m[i].length-1) {
					m[i][j] = m[i+1][0];
					rs[1]=0;
				}else {
					m[i][j]=m[i][j+1];
				}
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.printf("%5d",m[i][j]);
			}
			System.out.println();
		}
		if(col==0) {
			row--;
			col=m[0].length-1
		}else
			col--;
	}

	
	public static void main(String[] args) {
		DemoEx2_searchDelete d = new DemoEx2_searchDelete();
		//System.out.println(Arrays.toString(d.search(70,0,1)));
		d.delete(20);
	}

}
