package sist.com.basic;

public class Alphabet {
	
	public static void main(String[] args) {
//		A a=new A(); // a(10)
//		A a2=new A(50); // a(10)
//		a.setA(100);
//		System.out.println(a2.getA());
		
//		B b=new B(20, new A(10));
//		System.out.println(b.getA().getA());
//		
//		C c=new C(30, new B());
//		System.out.println(c.getB().getA());
		
		D d=new D(40, new C(10,new B(20, new A(30))));
		d.disp();
	
		
	}
	public void disp() {
		
//		System.out.println("a="+this.d.getD().getC().getB().getA());
//		System.out.println("b="+this.d.getD().getC().getB());
//		System.out.println("c="+this.d.getD().getC());
//		System.out.println("d="+this.d.getD());
	}

}
