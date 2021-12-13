package sist.com.operator;
//메모리 (공간)   연산자 (도구)	제어자
//메소드 (변수, 연산자, 제어문)
//최우선 ()를 쓰면 우선순위가 변경, []배열선언, '.'->(주소링크) 
//주황색글씨들은 예약어라고 부른다.
public class OperatorEx1 {
	
	public int firstOperator(int x, int y, int z) {
		
		//return x>y? x+y*z : (x+y)*z;
		
		return x>y? (x+y*z) : y<z? (x-y)*z : (x+y)*z; 
	}
	
	
	public int firstOperator(int x, int y, int z, int k) {
		
		//return x>y? x+y*z : (x+y)*z;
		return x>y && z<k? (x+y*z) : y<z? (x-y)*z : (x+y)*k; 
		
		
	}
	
	
	
	public static void main(String[] args) {
		OperatorEx1 o = new OperatorEx1();  //다이나믹 동 Heap
//		int rs = o.firstOperator(5, 6, 7); //5,6,7 arg 전달인자.인자.
//		System.out.printf("firstOperator Result = %d", rs);
		o.firstOperator(1, 2, 3);
//		int rs2 = o.firstOperator(2, 4, 5, 8);
//		System.out.printf("Result = %d", rs2);
	}

}
