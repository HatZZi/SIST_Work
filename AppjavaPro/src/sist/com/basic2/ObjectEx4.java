package sist.com.basic2;
//overload(메서드 이름이 같아야한다.인자 개수 또는 타입이 달라야한다)
public class ObjectEx4 {
	
	public void add() {
		System.out.println("add()");
	}
	public void add(byte value) {
		System.out.println("public void add(byte value)");
	}
	public void add(short value) {
		System.out.println("public void add(short value)");
	}
	
	public void add(int value) {
		System.out.println("public void add(int value)");
	}
//	public int add(int value) {
//		System.out.println("public void add(int value)");
//		return 0;
//	}
	
	public void add(String s,int value) {
		System.out.println("add(String s,int value)");
	}
	public void add(int value,String s) {
		System.out.println("int value,add(String s)");
	}
	public void add(int ...a) {
		System.out.println("add(int ...a)");
	}
	public void add(float value) {
		System.out.println("add(int ...a)");
	}
	
	public void add(long x, long y) {
		System.out.println("add(long x, long y)");
	}
	public void add(int x, int y) {
		System.out.println("add(int x, int y)");  
	}
	
	public static void main(String[] args) {
		ObjectEx4 o = new ObjectEx4();
		o.add((byte)10);  //byType
		o.add(3.14F);
		o.add(10, 20);
		o.add(10, 20L);
	}

}
