package sist.com.controller;

public class ControllerEx1 {
	
	public void controllerEx1() {
		int x = 1;
		System.out.println(x++==1);
	}
	
	public static void main(String[] args) {
		ControllerEx1 c = new ControllerEx1();
		c.controllerEx1();
	}

}
