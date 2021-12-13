package sis.com.array;

public class test {

	public void disp(int []m) {
		for (int i:m) {
			System.out.printf("%3d", i);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		test a = new test();
		int []m= {10,1,1,1,1,5,5,5,5,9};
		a.disp(m);
		
	}
}
