package sist.com.basic;

public class BookMain {
	
	
	
	public static void main(String[] args) {
		Book book1 = new Book(); // bookName|author|publisher|price(2000)|isbn
		Book book2 = new Book(); // bookName|author|publisher|price|isbn

		System.out.println("book1="+book1);
		System.out.println("book1="+book2);
		
		book2.setPrice(5000);
//		System.out.println(getPrice());  //오류나는 이유는 앞에 book.을 안 붙여서!!!
		System.out.println(book1.getPrice());  
		System.out.println(book2.getPrice());  
//		book.price = 5000;
//		System.out.println(book.price);
//		book.price = 5000;
		
		Book book3 = new Book();
		System.out.println("book3" + book3);
		book3.setAuthor("알ㄹ라라랄라");
		System.out.println(book3.getAuthor());
		book1.getInstance().setPrice(4500);
		System.out.println(book1.getInstance().getPrice());
		
		
	}

}
