package sist.com.basic5;

public class Unknown {
	
	private String name;
	private static Unknown unknown;
	
	public static Unknown getInstance() {
		if(unknown == null) {
			unknown = new Unknown();
		}
		return unknown;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	private Unknown() {
		super();
	}

}
