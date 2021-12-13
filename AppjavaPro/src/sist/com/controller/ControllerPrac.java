package sist.com.controller;

public class ControllerPrac {
	
	public void itTest() {
		int i = 1;
		for (; i<=10; i++) {
			if(i%2==0 && i!=0) {
				boolean j = true;			
				
				//System.out.println(j);
			}
			else {
				boolean j = false;
				
				//System.out.println(j);
			}
			
		}
		
		
	}
	
	public void itTest2(int k) {
		if(k%3==0 && k!=0) {
			System.out.println("3의 배수");
		}
		
	}
	
	public void itTest3() {
		
	}

	public static void main(String[] args) {
		ControllerPrac c = new ControllerPrac();
		//c.itTest();
	}

}
