package sist.com.basic;
//클래스밖에서 선언을 할 수 없다!!!글로벌변수는 없다!!!
public class OBJ2 {
	int data;  //멤버변수
	static int staticValue;  //스테틱변수 이자 멤버변수
	final int GAB = 500;   //종단변수 이자 멤버변수
	
	
	public void method() {
		int value=0;   //지역변수
		value++;   //초기값이 없기때문에 쁠쁠이 안된다!!
		this.data++;  //초기값 0이 되어있다.
		staticValue++; // 초기값0이 되어있다.
		System.out.println("value="+value+" data="+data+" staticValue="+staticValue);
	}
	
	public static void main(String[] args) {
		OBJ2 o1 = new OBJ2();
		OBJ2 o2 = new OBJ2();
		o1.method();
		
		o1.method();
		o1.method();
		o2.method();
		o2.method();
		o2.method();
		
		o1.data = 500;
		OBJ2.staticValue = 300;
		o1.data = o1.GAB/2;
		System.out.println(o1.data);
//		System.out.println("HelloMain");
//		new OBJ2().data = 90;
//		System.out.println(new OBJ2().data);
	}

}
