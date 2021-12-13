package sist.com.controller;

public class debug {
int num;
	public void aMethod() {
		int cnt = 0;
		cnt++;
		num++;
		bMethod();
	}
	
	public void bMethod() {
		num++;
	}
	
	public static void main(String[] args) {
		debug d = new debug();
		d.aMethod();
	
}
	
}
