package sis.com.array;

public class ArrayEx_Test2 {
	
	public void arrayEx() {                      //랜덤숫자 6개배열.
		int []m = new int [6];
		
		for (int i=0; i<m.length; i++) {
			m[i]= (int)(Math.random()*100)%45+1;
			for(int j=0; j<i; j++) {
					if(m[i]!=m[j]) {
						m[i] = (int)(Math.random()*100)%45+1;   //중복 피하기
					}				
			}

		}
		rank(m);
	}
	
	public void rank(int []x) {                   // 랭크매김.
		int []A = x;
     	int []Rank= new int [A.length];
		for (int i=0; i<A.length; i++) {                           
			Rank[i]=1;                                
			for(int j=0; j<A.length; j++) {          
				if(A[i]<A[j]) {                          
					Rank[i]++;
				}
			}
				
		}
		
		for (int i=0; i<A.length; i++) {          //랭크순서대로 배열.
			for(int j=i+1; j<A.length; j++) {
				int temp =0;
				if(A[i]<A[j]) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}        
		

		for(int i=0; i<Rank.length; i++) {
			for (int j=i+1; j<Rank.length; j++) {
				int temp =0;
				if(Rank[i]>Rank[j]) {
					temp = Rank[i];
					Rank[i] = Rank[j];
					Rank[j] = temp;
					
				}
			}
		}
		
		for(int i=0; i<A.length; i++) {        //랭크순서 배열 프린트.
			System.out.println(Rank[i]+"등 : "+A[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		ArrayEx_Test2 a = new ArrayEx_Test2();
		a.arrayEx();
		//System.out.println(a.arrayEx());
	}

}
