package sist.com.basic7;

public class PolymorphismEx {
	
	public void classCastAction(Object obj) {
		if(obj instanceof StringAction) {
		((StringAction)obj).stringAction();
		}
		if(obj instanceof NumberAction) {
			NumberAction new_name = (NumberAction)obj;
			new_name.numberAction();
		}
	}
	

	
	public static void main(String[] args) {
		PolymorphismEx e = new PolymorphismEx();
		e.classCastAction(new NumberAction());
	}

}
