package sist.com.basic4;

public class Father extends GrandFather{
	
	public Father() {
		
	}
	public Father(int v) {
		super();
	}
	
	public void work() {
		System.out.println("work");
	}

	public void sleep() {
		super.sleep();  // 선조의 슬립
		System.out.println("Father sleep");
	}
}
