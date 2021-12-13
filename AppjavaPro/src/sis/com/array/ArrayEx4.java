package sis.com.array;

public class ArrayEx4 {
   
   public void add(int []x) {   
      for(int i=0;i<x.length;i++) {
         System.out.printf("%5d",x[i]);
      }
   }
   public double totalValue(double []value) {
      int sum=0;
      for (int i = 0; i < value.length; i++) {
         sum+=value[i];
      }
      return sum;
   }
   public double getAvg(double []value) {
      return totalValue(value)/value.length;
   }
   public int getCount(double[]value,double avg) {
      int cnt=0;
      for (int i = 0; i < value.length; i++) {
         if(value[i]>avg)cnt++;
      }
      return cnt;
   }
   
   public void compare(double []value) {
	   
   }
   
   public void getMax(double []value) {
	   double max = 0;
	   for (int i = 0; i < value.length; i++) {
		   if (value[i] > value[j]) {
			   max = 
		   }
	   }
		   
	   swithch
	   
   }
   
   
   
   
   public void add() {
      double []height= {180.5,176.9,188.2,152.9,145.9};
      double []weight= {80.5,76.9,88.2,52.9,45.9};
      System.out.println("heightAvg:"+getAvg(height));
      System.out.println("weightAvg:"+getAvg(weight));
      
      System.out.println("heightAvgMoreCount:"+getCount(height, getAvg(height)) );
      System.out.println("weightAvgMoreCount:"+getCount(weight, getAvg(weight)));
   }
  
   public static void main(String[] args) {
      ArrayEx4 a=new ArrayEx4();
      a.add();
      
   }

}