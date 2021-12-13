package sist.com.basic2;

public class ObjectEx6 {   //scope
	private String value;
	private final String maker = "Oracle";
	
	public ObjectEx6(String value) {    //디폴트 생성자! 인스턴스변수를 초기화하는 목	
		this.value = value;
//		this.maker="sun";
	}
	public static void main(String[] args) {
		new ObjectEx6("A");  //heap에 value가 생성, maker가 생성.
		new ObjectEx6("B");  //heap에 value가 생성, 위의 maker와 같은 maker가 할당.
	}

}
