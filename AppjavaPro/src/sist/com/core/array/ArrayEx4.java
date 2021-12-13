package sis.com.variable.core;
//1차원 석차, 중복검사 , 로또알고리즘 
	
public class ArrayEx4 {
	int []m = new int[6];  //instance변수 
	int []rank = new int [m.length];
	public void initArray() {
		for (int i = 0; i < m.length; i++) {
			m[i] = (int)(Math.random()*100);
		}
	}
	
	public void rank() {   // 
		for (int i = 0; i < m.length; i++) {
			rank [i] = 1;
			for (int j = 0; j < m.length; j++) {
				if(m[i]<m[j]) {
					rank[i]++;
				}
			}
		}
		disp(m);
		disp(rank);
	}
	
	public void disp(int[]m) {		
		for (int i:m) {
			System.out.printf("%5d", i);
		}
		System.out.println();
	}
	
	
	public int randomProcess() {
		
		return (int)(Math.random()*100%45)+1;
	}
	
	public void lottoProcess() {
		for (int i = 0; i < m.length; i++) {
			m[i] = randomProcess();
			for (int j = 0; j < i; j++) {
				if(m[i]==m[j]) i--;
			}
		}
		disp(m);
	}
	
	public static void main(String[] args) {
		ArrayEx4 a = new ArrayEx4();
		
		a.lottoProcess();
		
		//a.initArray();
		
		//a.rank();
	}

}
