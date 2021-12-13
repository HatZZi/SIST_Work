package sist.com.core.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {
	
//	public int[] add(int ...x) {
//		for(int i = 0; i< x.length; i++) {
//			x[i]+=50;
//		}
//		return x;
//	}
	
	public int[] add(int []x) {
		int i=0;
		while(i<x.length) {
			x[i++]+=100;
		}
		return x;
	}
	
	public double[] doubleAdd() {
		Scanner scanner = new Scanner(System.in);
		double []value = new double[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Data : ");
			value[i] = scanner.nextDouble();
		}
		Arrays.sort(value);
		return value;
	}
	
	
	
	public String[] add(String ...str) {
		
		return new String[] {str[0], str[2]};
	}
	
//	public void add(int ...x) {
//		
//	}
//	
	public static void main(String[] args) {
		ArrayEx1 a = new ArrayEx1();
		for(double d:a.doubleAdd()) {
			System.out.println(d);
		}
		String s1=a.add("Java", "Xml", "React", "vue", "10.5")[0];
		String s2=a.add("Java", "Xml", "React", "vue", "10.5")[0];
		
//		a.add(new int[] {50,60});
//		a.add(new int [] {10,20,30,40,50});
		
//		for(int i:a.add(10,20,30,40,50)) {
//			System.out.println(i);
//		}
	}

}
