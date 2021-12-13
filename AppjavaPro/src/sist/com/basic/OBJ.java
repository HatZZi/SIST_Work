package sist.com.basic;



public class OBJ {
	
	int instancaValue;  //new 를 했을때 생성이 되는것이고, Heap에 생성된다. Heap(<-> static(class))
	static int staticValue; // 클래스영역 == static;
	final int DATA = 100; //종단변수는 선언할때부터 값을 지정해주어야 한다.
	
	public void method() {
		int local; // stack
	}
	public void method(int x) {
		int local; // stack
	}
//	public void method(int y) {   //이름도 같고 타입도 같으면 에러난다!!!
//		int local; // stack
//	}
	public void method(long y) {   
		int local; // stack
	}

}
