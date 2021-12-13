package sist.com.basic8;

public abstract class AbstractWindowEx implements MouseInter{

	
	@Override
	public void mousePress() {
		// TODO Auto-generated method stub
		System.out.println("MouseWindowPress");
	}

	@Override
	public void mouseClick() {
		// TODO Auto-generated method stub
		System.out.println("MouseWindowClick");
	}
	
	public abstract void mouseRelease();
	
}
