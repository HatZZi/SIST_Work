package sis.com.array;

public class ArrayEx8_2 {
	
	public void arrayEx() {
		int []m= new int [10];
		for(int i=0; i<m.length; i++) {
			m[i] = (int)(Math.random()*10)%5+1;
			//System.out.println(m[i]);
		}
		for(int i:m) {
			System.out.printf(i + "  ");
		}
		System.out.println();
		mode(m);
	}
	
	public int arrayCount(int []y) {
		int max = 0;
		for(int i=0; i<y.length; i++) {
			if(max<y[i]) {
				max = y[i];
			}
		}
		return max;
		
	}
	
	
	public void mode(int []x) {
		int []c = new int [x.length];
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x.length; j++) {
				if(x[i]==x[j]) {
					c[i]+=1;
				}
			}

		}
		
		System.out.print("최빈값은 ");
		
		int compare = 0;
	      for (int i = 0; i < c.length; i++) {
	          if(c[i]==arrayCount(c)) {
	             if(compare!=0 && compare==x[i])continue;
	             System.out.print(x[i]+"   ");
	             compare=x[i];
	          }
	       }
//		for(int i=0; i<x.length; i++) {
//			
//			if(c[i]==arrayCount(c)) {
//				if(compare!=0 && compare==x[i])continue;
//	             System.out.print(x[i]+"\t");
//	             compare=x[i];
//				
//			}
//		}
		System.out.println("가 "+arrayCount(c)+"번 나옵니다. ");	
	}
	
	public static void main(String[] args) {
		ArrayEx8_2 a = new ArrayEx8_2();
		
		a.arrayEx();
		
	}

}
