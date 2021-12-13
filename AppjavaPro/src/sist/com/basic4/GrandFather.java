package sist.com.basic4;

public class GrandFather extends Object {
	
	public GrandFather() {
		
	}
	
	public GrandFather (int v) {
		
	}
//	private void sleep() {
//		System.out.println("GrandFather sleep");  //선조에서 프라이빗이 걸리면 오버라이딩 못함.
//	}
	public void sleep() {
		System.out.println("GrandFather sleep");
	}

}
