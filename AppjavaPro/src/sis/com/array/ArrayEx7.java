package sis.com.array;

public class ArrayEx7 {
	
	public int max(int []m) {
		int maxValue=0;
		
		for(int i=0; i<m.length; i++) {
			if(m[i]>maxValue) maxValue = m[i];
		}
		return maxValue;
	}
	
	public int min(int []m) {
		int minValue=m[0];
		for (int i=0; i<m.length; i++) {
			if(m[i]<minValue) minValue = m[i];
			
		}
		return minValue;
	}
	public int abs(int data) {
	      return data<0?-data:data;
	   }
	   public int nearData(int []data,int target) {
	      int near=0,gab=0,mingab=data[0]-target;
	      for (int i = 0; i < data.length; i++) {
	         gab=data[i]-target;
	         if(abs(gab)<=abs(mingab)) {
	            mingab=gab;
	            near=data[i];
	         }
	      }
	      return near;
	      
	   }
	
	public static void main(String[] args) {
		ArrayEx7 a = new ArrayEx7();
		int []m= {10,95,100,27,85};
		System.out.println(a.max(m));
		System.out.println(a.min(m));
		System.out.println(a.nearData(m, 99));
		
	}

}
