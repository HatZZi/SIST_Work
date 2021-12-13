package sist.com.basic9;

public class Cat extends Test implements RunableEx, ThinkAbility,Pet {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Cat Run");
	}

	@Override
	public void think() {
		// TODO Auto-generated method stub
		System.out.println("Cat Think");
	}

	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("Pet Cat");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
	

}
