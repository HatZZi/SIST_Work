package sist.com.controller;

public class Test {
	int num;
	   public void aMethod() {
	      int cnt=0;
	      cnt++;
	      num++;
	      bMethod();
	   }
	   public void bMethod() {
	      num++;
	   }
	   
	   public static void main(String[] args) {
	      Test t=new Test();
	      t.aMethod();
	   }

}
