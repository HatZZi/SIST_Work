package sist.com.basic;

public class D {
	private int d;
	private C c;
	
	public D() {
		
	}
	
	public D(int d) {
		this.d=d;
	}
	
	public D(int d, C c) {
		this.d=d;
		this.c=c;
	}
	
	public void setD(int d) {
		this.d=d;
	}
	
	public int getD() {
		return this.d;
	}
	
	public void setC(C c) {
		this.c=c;
	}
	public C getC() {
		return this.c;
	}

public void disp() {
		
		System.out.println("a="+this.getC().getB().getA().getA());
		System.out.println("b="+getC().getB().getB());
		System.out.println("c="+getC().getC());
		System.out.println("d="+getD());
	}
}
