package sis.com.array;

public class ArrayMethod3 {
	//int index;
	int []m = {45,95,27,65,11};
	
/*	public void increment(int []m) {
	      int []imsi=new int[m.length*2];//[][][][][][][][][][]
	      for (int i = 0; i < m.length; i++) {
	         imsi[i]=m[i];
	      }
	      m=imsi;
	      search(m);
	}
	*/
	public void search() {
		
		for (int i=0; i<m.length; i++) {
			if(m[i]==95) {
				m[i]=0;
//				temp = x[i];
//				x[i] = x[i+1];
//				x[i+1] = temp;
				move(i);
			}
			}
		
		
//		for(int i=0; i<m.length; i++) {
//			System.out.println(m[i]);
//		}
		
	}
	
	public void move(int c) {
		for(int j = 0; j<m.length-1; j++) {
			int temp = 0;
			temp = m[c];
			m[c] = m[c+1];
			m[c+1] = temp;
		}
		
		for(int i = 0; i<m.length; i++) {
			System.out.println(m[i]);
		}
	}
	
//	public void delete(int x) {
//		if(isFull()) {
//	         increment();         
//	      }
//	      m[index--]=0;
//	   

		
		
		
		
//		m[index] = 95;
//		int num = 0;
//		int []imsi = new int [m.length];
//		for(int i = 0; i<m.length; i++) {
//			if(i == index) {
//				m[index] = 0;
//			}else {
//				imsi[i] = m[i];
//				
//			}
//		}
		
		
	
	
	
	public static void main(String[] args) {
		ArrayMethod3 a = new ArrayMethod3();
		int []m = {45,95,27,65,11};
		a.search(m);
		
	}

}
