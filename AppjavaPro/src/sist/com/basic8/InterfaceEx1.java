package sist.com.basic8;

public interface InterfaceEx1 {  //속성 (final static만 들어갈수있다)기능(추상메서드)

	static final int VALUE = 500;
//	static {                //무조건 final과 static인 변수가 선언되기때문에 중간에 바꿀수없다.
//		VALUE = 10;
//	}
	public void interMethod1();  //무조건 추상만 들어오기때문에 abstract을 굳이 안써도 된다.
	
}
