package sist.com.basic3;

public class Parent {
	
	private int parentValue;
	
	public Parent() {
		
	}
	
	public Parent(int parentValue) {
		this.parentValue = parentValue;
		System.out.println("Parent생성자");
		System.out.println(this.parentValue);
	}
	
	

}
