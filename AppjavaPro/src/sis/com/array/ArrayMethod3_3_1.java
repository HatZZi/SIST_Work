package sis.com.array;

public class ArrayMethod3_3_1 {
	
	   public static void main(String[] args) {
		   int searchNum=27;
		   int []arr = {10,27,20,27,25,45,30,50};
		   int []arr_result = new int[arr.length];
		   int cnt = 0;
		   for (int i = 0; i < arr_result.length; i++) {
		      if(arr[i] == searchNum) {
		         arr_result[cnt] = 0;
		         continue;
		      }
		      arr_result[cnt] = arr[i];
		      cnt++;
		      }
		      for (int i = 0; i < arr_result.length; i++) {
		         System.out.println(arr_result[i]);
		      }
	   	}
	

}
