package sist.com.Practice;

public class VariableP2 {
	
	public int byteCal() {             // 리턴값이 int이기 때문에 void가 아닌 int를 입력.
		byte byteValue1 = 100;
		byte byteValue2 = 100;
		
		return byteValue1 + byteValue2; // 연산할때 기본값은 int이다.
	}
	
	public static void main(String[] args) {  // void는 빈 공간, return값이 없을때만 사용이 가능하다.
		VariableP2 v = new VariableP2();
		
		System.out.println(v.byteCal());
	}

}
