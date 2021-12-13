package sist.com.Practice;

import java.util.Arrays;


public class ArrayP1 {
	int [][]m = new int [2][3];
	int []imsi = new int[2];
	int index;
	int row = 0;
	int col = -1;
	int rowRev;
	int colRev;
//	
	public boolean isEmpty() {
		return row==0 && col==0;
	}
	
	public boolean isFull() {
		return row==m.length-1 && col==m[0].length-1;
	}
	
	public int[] search1(int value) {
		for (int i = 0; i < m.length-1; i++) {
			for (int j = 0; j < m[0].length-1; j++) {
				if(m[i][j]==value) {
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
	
	public int[] search2(int value, int rowFind, int colFind) {
		for (int i = rowFind; i < m.length; i++) {
			for (int j = colFind; j < m[0].length; j++) {
				if(m[i][j]==value) {
					return new int[] {i,j};
				}
				colFind=0;
			}
		}
		return null;
	}
	
	
	public int[] increment() {
		
		int [][]arrayNew = new int [m.length+2][m[0].length];
		System.arraycopy(m, 0, arrayNew, 0, m.length);
		m=arrayNew;
//		for(int [] i : m) {
//			System.out.println(Arrays.toString(i));
//		}
		int[]imsi = {m.length-1, m[0].length};
//		System.out.println();
		return imsi;
		
		//return imsi;
			
//		int rowRev = m.length-1;
//		int colRev = m[0].length;
		
//		for(int []i:m) {
//			System.out.println(Arrays.toString(i));
//		}
	}
	
	public void add(int data, int state) {
		
		if(isFull()) {
			int []reV = increment();
			rowRev=reV[0];
			colRev=reV[1];
//			System.out.println("rowRev="+rowRev+"  colRev="+colRev);
		}
		
		
		if(state == 'a') {
			if(col<m[0].length-1) {
				col++;
			}
			else {
				col = 0;
				row++;
			}
			m[row][col] = data;
		}
		
		if(state == 'b') {
//			System.out.println("rowRev="+rowRev+"  colRev="+colRev);
			if(colRev!=-1) {
				colRev--;
				//System.out.println("colRev="+colRev);
			}
			if(colRev==-1) {
				rowRev--;
				colRev = m[0].length-1;
			}
			m[rowRev][colRev] = data;

		}
	}
	
	public void modify(int origin, int change, int rowFind, int colFind, int state) {
		int[]rs = search2(origin,rowFind,colFind);
		//System.out.println(Arrays.toString(rs));
		if(rs==null)return;
		m[rs[0]][rs[1]]=change;
		if(state=='k')modify(origin,change,rowFind,colFind,state);
	}
	
	public void delete(int origin, int rowFind, int colFind, int state) {
		int []rs = search2(origin, rowFind, colFind);
		if(rs==null)return;
		for(int i = rs[0]; i<m.length; i++) {
			for(int j = rs[1]; j<m[0].length; j++) {
				if(rs[0]==m.length-1 && rs[1]==m[0].length) {
					m[rs[0]][rs[1]]=0; break;
				}
				if(rs[1]<m.length-1) {
					m[rs[0]][rs[1]] = m[rs[0]][rs[1]+1];
				}else {
					m[rs[0]][rs[1]] = m[rs[0]+1][rs[0]];
				}
		}
		}
		if(state=='k')delete(origin,rowFind,colFind,state);
		
	}
	
	
	public void disp() {
		for(int []i:m) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	public static void main(String[] args) {
		ArrayP1 a = new ArrayP1();
		a.add(10,'a');
		a.add(20,'a');
		a.add(30,'a');
		a.add(40,'a');
		a.add(50,'a');
		a.add(60,'a');
		
		a.add(10,'b');
		a.add(20,'b');
		a.add(30,'b');
		a.add(40,'b');
		a.add(50,'b');
		a.add(60,'b');
		
		a.modify(30, 100, 0, 1, 'k');
		
		a.delete(10, 0, 0, 0);
		
		a.disp();
	}

}
