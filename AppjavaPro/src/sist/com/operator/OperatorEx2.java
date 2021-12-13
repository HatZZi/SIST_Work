package sist.com.operator;
//연산자
//최우선 연산자 () [] . 
//단항 연산자 unaryOperator , + -(sign), ++증감식 --감소식 , !, ~(bit not)
public class OperatorEx2 {
	
	public int unaryOperator(int x) {
		System.out.println("unaryOperator(int x)");
		return !(x>10)? -x : +x;
		
	}
	
	public void unaryOperator(byte x) {
		System.out.println("unaryOperator(String x)");
	}
	
	public boolean unaryOperator(int x, int y, int z, int k) {
		
		return (!!(x<z) && (x+y)*z>(x-y)/z? "Java" : "Oracle").equals("Oracle");
	}
	
	public static void main(String[] args) {
		OperatorEx2 o =new OperatorEx2();
		//o.unaryOperator((byte)10);
		System.out.println(o.unaryOperator(2, 3, 6, 7));
		//System.out.println(o.unaryOperator(10));
		
	}

}
