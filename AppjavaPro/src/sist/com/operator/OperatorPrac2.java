package sist.com.operator;

public class OperatorPrac2 {
	
	public boolean calcOperator(int x, float y) {
		return !(x*y>10) && (++x+y/x) > (++y-x/y); 
		
		
	}
	
	public void calcOperator2() {
		System.out.println(calcOperator(12,-14.3F));
	}
	
	
	
	
	public static void main(String[] args) {
		OperatorPrac2 o = new OperatorPrac2();
		o.calcOperator2();
	}

}
