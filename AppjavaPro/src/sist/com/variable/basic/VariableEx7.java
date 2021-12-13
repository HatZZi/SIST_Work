package sist.com.variable.basic;
//변수는 DATA를 담는 공간

public class VariableEx7 {
	//자료형 변수   instance변수  Heap
	public void methodEx1(int x, int y, int z) {  // x y z parameter 인(매개변수), 지역변    메서드 헤더부
		//지역변수 auto변수   Stack
		//int x; 에러난다  같은 공간에서 같은 이름 할당불가 
		x = x + 1;
		y = y + 1;
		z = z + 1;
		System.out.println("x="+x+"y="+y+"z="+z);
		
	}
	
	public static void main(String[] args) {
		VariableEx7 v = new VariableEx7();
		//v.methodEx1(1,2,3); //1,2,3 Arguments(전달인자)
		int x = 10, y = 20, z = 30;
		v.methodEx1(x, y, z);
		
		System.out.println("x="+x+"y="+y+"z="+z);
		
	}

}
