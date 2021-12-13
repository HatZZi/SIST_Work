package sis.com.array;

public class ArrayMethod2 {
	
	public void add(int []m) {
		int []imsi = new int [m.length*2];
		m=imsi;
		System.out.println(m.length);
	}
	
	public void reverse(char []c) {
		char[]imsi = new char[c.length];
		for(int i=0; i<imsi.length; i++) {
			imsi[i] = c[c.length-(i+1)];    
		}
		c=imsi;
		System.arraycopy(imsi, 0, c, 0, imsi.length);
	}
	
	public static void main(String[] args) {
		ArrayMethod2 a = new ArrayMethod2();
		
		char []c= {'A', 'j', 'a', 'x'};
		a.reverse(c);
		
		int []m = new int [5];
		a.add(m);
	}

}
