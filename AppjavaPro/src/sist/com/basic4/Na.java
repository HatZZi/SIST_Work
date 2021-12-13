package sist.com.basic4;

public class Na extends Father{
	
	public Na() {
		super(10);
	}
	public void game() {
		System.out.println("game");
	}
	public void sleep() {
		System.out.println("Na sleep");  //오버라이드 선조의것을 그대로!!쓰는것 메소드 이름 인자 결과형 모두 같아야한다!!!
	}

}
