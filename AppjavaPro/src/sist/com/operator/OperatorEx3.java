package sist.com.operator;

public class OperatorEx3 {
	
	
	public int unaryOperator (int x, int y, int z, int k, int q) {
		return ++x + --y + z++ + --q; // 2 + 1 + 3 + 4 = 10
	}
	
	public void unaryOperator (int data) {
		System.out.println(!(data==5));
		System.out.println(~data);
		
	}
	
	public void calcOper (int x) {
		if (x!=0 && x%3==0) {
			System.out.println("3의 배수");
		}
		else if (x!=0 && x%5==0) {
			System.out.println("5의 배수");
		}
		else if (x!=0 && x%7==0) {
			System.out.println("7의 배수");
		}
		else  {
			System.out.println("기타 배수");
		}
		
	}
	
	public void calcOper2 (int x) {
		if (x!=0 && x%3==0 && x%5==0 && x%7==0) {
			System.out.println("3,5,7의 공통 배수");
		}
		
		else  {
			System.out.println("기타 배수");
		}
		
	}
	
	public String pracOperator1 (float x, int y) {
		return (int)((x/y)%2)>0? "0보다 크다." : "0보다 작거나 같다.";
	}
	
	public boolean pracOperator2 () {
		return 
	}
	
	public static void main(String[] args) {
		OperatorEx3 o = new OperatorEx3();
		o.pracOperator2();
		//System.out.println(o.pracOperator1(10.73F, 3));
		//o.calcOper(105);
	    //o.calcOper2(105);
		//o.unaryOperator(10);
		//System.out.println(o.unaryOperator(1,2,3,4,5));
	}

}
