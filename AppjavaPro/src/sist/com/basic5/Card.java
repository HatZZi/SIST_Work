package sist.com.basic5;

public class Card {
	
	private String name;
	private static Card card;
	
	public static Card getInstance() {   //만약 생성자가 private일때 고민해서 사용한것.
		if(card == null) {
			card = new Card();
		}
		return card;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	private Card() {
		super();
	}

}
