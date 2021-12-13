package sist.com.operator;

public class OperatorPrac {
	
	public int practicing1(int x, int y) {
		return x<y? x+y : x-y;
	}
	
	public int practicing2(int k, int z) {
		int rs = o.practicing1(2,3);
		return rs;
	}
	
	public int practicing3(int u, int h) {
		return u+h;
	}

	public static void main(String[] args) {
		OperatorPrac o = new OperatorPrac();
		
		System.out.println(o.practicing2(5,7));
		int rs2 = practicing3(4,5);
	}

}
