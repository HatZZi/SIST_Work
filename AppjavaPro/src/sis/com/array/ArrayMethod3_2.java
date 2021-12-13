package sis.com.array;

public class ArrayMethod3_2 {
	int []m = {45,95,27,65,11};
	int index;
	
	public int search(int data ) {
	      for (int j = 0; j < m.length; j++) {
	         if(m[j]==data)return j;
	      }
	      return -1;
	   }
	   
	   public void delete(int data) {
	      int index=search(data);
	      if(index==-1)return;
	      
	      for (int i = index; i < m.length; i++) {
	         if(i==m.length-1) {
	            m[i]=0;
	            break;
	         }
	         m[i]=m[i+1];
	      }
	      for(int i=0; i<m.length; i++) {
	    	  System.out.println(m[i]);
	      }
	   }
	
	
	public static void main(String[] args) {
		ArrayMethod3_2 a = new ArrayMethod3_2();
		
		a.delete(95);
		
		
		
		
	}

}
