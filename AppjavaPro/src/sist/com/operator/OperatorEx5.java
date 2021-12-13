package sist.com.operator;

//4년마다 오는게 윤달.
public class OperatorEx5 {
	
	public boolean yunDal(int year) {
		return year%4==0 && year%100!=0 || year%400==0;
	}
	
	public void logicOperator(int year) {
		System.out.println(yunDal(year)? "윤달" : "비윤달");
	}
	
	public void samHang(int x, int y, int z, int k) {
		System.out.println(x++==++y?(x-y*z==4)?"O":"X" :(k++ -z++>10)? "Y":"N");
		System.out.println("x="+x+" y="+y+" z="+z+" k="+k);  //2 3 4 5
	}
	
	public void itTest(int x, int y, int z, int k) {
		boolean rs = ++x==y++ || (y++==--z || z++==k--);
		System.out.println(rs);
		System.out.println("x="+x+" y="+y+" z="+z+" k="+k); // 3 6 5 6 
	}
	
	public static void main(String[] args) {
		OperatorEx5 o = new OperatorEx5();
		o.itTest(2, 4, 5, 7);
		//o.samHang(1, 2, 3, 4);
		//o.logicOperator(400);
	}

}
