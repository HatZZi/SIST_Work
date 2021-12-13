package sist.com.basic;
//class 는 설계도이다.(속성(data) + 기능(function(행동))), 사용자정의 자료형
public class Book {
	private String bookName;
	private static String author;
	private String publisher;
	private int price;  //클래스 내에서는 접근이 가능하지만 외부는 안된다.
	private String isbn;   
	
	public void setPrice(Book this, int value){  //기능
//		if(value>=6000 && value<=9500);
		System.out.println("this=" + this);
		this.price = value;
	}
	
	public int getPrice() {          //기능
		return this.price;
	}
	
	public void setAuthor(Book this, String str) {
		author = str;
	}
	public String getAuthor() {
		return author;
	}
	
	
	public Book getInstance(Book this) {
		return this;
	}
	
	private static void main(String[] args) {
		new Book().bookName = "자바의 정석";  // 메모리Heap에 book네임이 만들어진것
		System.out.println(new Book().bookName);
		
		Book b = new Book();
		b.bookName = "연지처럼...";
		System.out.println(b.bookName);
		
//		Book book = new Book(); //지역변수 bookName|author(최은영)|publisher|price|isbn
//		book.author="최은영";
		
		
	}
	
	 /*
     * Book book=new Book();//bookName|author(최은영)|publisher|price|isbn
     * book.author="최은영"; System.out.println(book.author);
     */
    
    //new Book().bookName="민섭의정석";//bookName(민섭의정석)|author|publisher|price|isbn
    //System.out.println(new Book().bookName);//bookName|author|publisher|price|isbn
    //Book b= new Book();//bookName|author|publisher|price|isbn
    //b.bookName="연지처럼..";
    //System.out.println(b.bookName);
	
}


