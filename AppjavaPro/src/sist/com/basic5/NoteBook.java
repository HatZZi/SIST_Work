package sist.com.basic5;

public class NoteBook {
	
	private int screenSize;    //멤버변수들  선언문은 우선순위가 제일 높다. 
	private String cpu;
	private String ram;
	static String nation;
	private final int COUNT = 100;
	
	static {
		System.out.println("static Block");
//		ram = "16GB";
	}
	
	
	public NoteBook() {
		System.out.println("NoteBook()");   //생성자는 뉴 하기전에 불려지지 않음.
		ram = "16GB";
	}
	
	public static void main(String[] args) {
		System.out.println("main Method");
		NoteBook notebook = new NoteBook();
	}

}
