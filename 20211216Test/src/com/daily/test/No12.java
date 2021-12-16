package com.daily.test;

public class No12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line = 0;
		for (int i = 1; i <=30; i++) {
			
			if(i%2==0) {
				System.out.print(i+" ");
				line++;
				if(line>2) {
					System.out.println();
					line=0;
				}
			}
		}
			

		
	}

}
