package sist.com.controller;
//
public class ControllerEx6 {
	
	public void loopingEx1(int count) {   //전달인자를 사용하는 목적은 코드의 유연성을 확보 
		for(int i=1; i<=count; i++) {
			if(i%6==1)System.out.printf("\n");  // 6의배수 다음은 엔터줄바꿈 
			//if(i%2==0)continue;     //짝수일때는 건너뛰어라 
			System.out.printf("%5d",i);
		}
	}
	
	public void loopingEx2(int count) { 
		int i=0;
		while(i<count) {
			i++;
			if(i%2==0)continue;
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		ControllerEx6 c = new ControllerEx6();
		c.loopingEx1(1000);
	}

}
