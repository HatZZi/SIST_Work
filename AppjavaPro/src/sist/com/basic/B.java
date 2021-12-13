package sist.com.basic;

public class B {
	private int b;
	private A a;
//	public B() {
//		
//	}
	public B() {
		
	}
	
	public B(A a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public B(int b) {
		this.b=b;
	}
	
	public B(int b, A a) {
		this.b=b;
		this.a=a;
	}
	
	public B(A a) {
		this.a=a;
	}
	public void setA(A a) {
		this.a=a;
	}
	public A getA() {
		return this.a;
	}
	public void setB(int b) {
		this.b=b;
	}
	public int getB() {
		return this.b;
	}

}
