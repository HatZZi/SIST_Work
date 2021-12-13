package sist.com.basic7;

public abstract class AbstractSub extends AbstractSuper{
	
	private int abstractSub;
	private int subValue;
	
	public AbstractSub() {
		
	}
	
	public AbstractSub(int superValue, int subValue) {
		super(superValue);
		this.subValue = subValue;
	}
	
	public abstract void abstractSubMethod();

}
