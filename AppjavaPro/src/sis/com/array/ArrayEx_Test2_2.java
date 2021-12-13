package sis.com.array;

public class ArrayEx_Test2_2 {
	
	public void Rank(int[] x) {
	      int[] rank=new int[x.length];
	      for(int i=0;i<x.length;i++) {
	         rank[i]=1;
	         for(int j=0;j<x.length;j++) {
	            if(x[i]<x[j])rank[i]+=1;
	         }         
	      }
	      //점수 정렬
	      for(int i=0;i<x.length;i++) {
	         for(int j=i+1;j<x.length;j++) {
	            int temp=0;
	            if(x[i]<x[j]) {
	               temp=x[i];
	               x[i]=x[j];
	               x[j]=temp;
	            }
	         }         
	      }
	    
	      //석차 정렬
	      for(int i=0;i<rank.length-1;i++) {
	         for(int j=i+1;j<rank.length;j++) {
	            int temp=0;
	            if(rank[i]>rank[j]) {
	               temp=rank[i];
	               rank[i]=rank[j];
	               rank[j]=temp; 
	            }         
	         }
	      }
	      
	      for(int i=0;i<rank.length;i++) {
	         System.out.printf("%d위  %d점\n",(rank[i]),x[i]);
	      }
	         
	   }
	   
	   
	   public static void main(String[] args) {
		   ArrayEx_Test2_2 t=new ArrayEx_Test2_2();
	      t.Rank(new int[] {95,90,50,40,78});
	   }
	      
	}


