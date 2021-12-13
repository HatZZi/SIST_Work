package sist.com.basic7;

public abstract class AbstractSuper {  //추상클래스는 생성자가 있다!!
	
	private int abstractSuper;
	
	public AbstractSuper() {
		
	}
	
	public AbstractSuper(int superValue) {
		super();
		this.abstractSuper = superValue;
	}
	
	public abstract void abstractSuperMEthod();
	
	public final void superInstanceMethod() {
	}
	
	

}
