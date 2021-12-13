package sist.com.basic5;

public class CardMain {
	
	public static void main(String[] args) {
		Card.getInstance().setName("연지");
		System.out.println(Card.getInstance().getName());
	}

}
