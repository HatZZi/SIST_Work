package sist.com.basic2;

public class ObjectEx1 {
	//자료형 변수명; 자료형(기본,참조), class영역, heap영역.
	private int data;  // Instance Variable   heap
	
	private static int classVariable;   //class영
	
	public void instanceMethod(ObjectEx1 this) {
		System.out.println("instanceMethod");
		int local=10;  //Local Variable   Stack
		data=500;
	}
	public static void staticMethod() {    //static에선 this를 인식하지못한다.
		System.out.println("staticMethod");
//		this.data = 99;   //static에서는 this사용 못한다.
	}
	
	public static void main(String[] args) {
		ObjectEx1 o1 = new ObjectEx1();
		ObjectEx1 o2 = new ObjectEx1();
		o1.instanceMethod();
		staticMethod();
	}

}
