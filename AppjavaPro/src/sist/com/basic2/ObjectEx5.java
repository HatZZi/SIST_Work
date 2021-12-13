package sist.com.basic2;

public class ObjectEx5 {
	
	public void add(int x, long y) {
		System.out.println("add(int x, long y)");
	}
	public void add(long x, int y) {
		System.out.println("add(long y, int x)");
	}
	
	public void add(int x, int y) {
		System.out.println("add(int x, int y)");
	}
	public void add(long x, long y) {
		System.out.println("add(long x, long y)");
	}

	
	public void makerOverload1() {
		byte b = 20;
		short s = 25;
		System.out.println(b);
		System.out.println(5>3);
		System.out.println(new char[] {'a','b','c'});
		System.out.println(10.5F);
		System.out.println("abc");
	}
	
	public void array(int ...x) {
		System.out.println("array(int ...x)");
	}
	public void array(long ...x) {
		System.out.println("array(long ...x)");
	}
	public void array(double ...x) {
		System.out.println("array(double ...x)");
	}
	
	public static void main(String[] args) {
		ObjectEx5 o = new ObjectEx5();
		o.add(10, 10L);
		o.add(10L, 10);
		o.add(10, 10);
		o.add(10L, 10L);
		o.array(new int[] {10,20,30});
		o.array(new double[] {10,20,30});
		
		o.makerOverload1();
	}
}
