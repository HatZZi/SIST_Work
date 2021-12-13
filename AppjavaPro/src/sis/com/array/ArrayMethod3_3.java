package sis.com.array;

public class ArrayMethod3_3 {
	int []m = {23, 95, 64, 13, 95};

	int index1;
	int index2;
	
	
	public int search1(int num) {   //첫번째 95의 인덱스값 도출.	
		for (int i=0; i<m.length; i++) {
			if(m[i] == num)
			search2(num,i);
		}			
		return -1;
	}
	
	public int search2(int num, int j) {	  //두번째 95의 인덱스값 도출.
		for (int i = j+1; i<m.length; i++) {
			if(m[i] == num) delete(i,j);	
		}
		return -1;
	}

	
	public void delete(int x, int y) {
		int index1 = x;
		int index2 = y;
		if(index1 == -1) return;
		
		for(int i = index1; i<m.length; i++) {    //첫번째 95 제거.
			if(i == m.length-1) {
				m[i] = 0;
				break;
			}
			m[i] = m[i+1];
		}
		for(int i=index2; i<m.length; i++) {      //두번째 95 제거.
			if(i == m.length-1) {
				m[i] = 0;
				break;
			}
			m[i] = m[i+1];
		}
		
		for(int i=0; i<m.length; i++) {
			System.out.println(m[i]);
		}
	}	
	
	public static void main(String[] args) {
		ArrayMethod3_3 a = new ArrayMethod3_3();
		a.search1(95);
	}

}
