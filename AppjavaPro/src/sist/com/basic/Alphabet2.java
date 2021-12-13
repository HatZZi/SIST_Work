package sist.com.basic;

public class Alphabet2 {
	private D d=new D(40, new C(10,new B(20, new A(30))));
	
	public void disp() {
		
		
		System.out.println("a="+d.getC().getB().getA().getA());
		System.out.println("b="+d.getC().getB().getB());
		System.out.println("c="+d.getC().getC());
		System.out.println("d="+d.getD());
	}
	public static void main(String[] args) {
	
		Alphabet2 a2=new Alphabet2();
		a2.disp();
	
		
	}

}
