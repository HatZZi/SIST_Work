package com.sist.main;
/*
 * 메소드()throws
 * =>호출시에 예외처리를 하고 사용
 *   1. 메소드()throws  (통합:Exception, Throwable)
 *   2. 메소드(){  
 *         try{
 *         }catch{
 *         }
 *      }
 * 
 */
public class MainClass2 {
	//선언 (라이브러리) => 오라클
	//IO, Network, Oracle....
	String name;
	
	public static MainClass2 createClass()throws Exception{
		//클래스 이름으로 메모리 할당이 가능(리플렉션)
		//스프링 => 클래스 이름을 제공하면 => 메모리 할당(클래스 관리)]
		//스프링 => 클래스관리
		Class clsName = Class.forName("com.sist.main,MainClass2");
		Object obj = clsName.getDeclaredConstructor().newInstance();
		return (MainClass2)obj;
		//결합성(다른 영향이 있는지 여부), 응집성(메소드)
	}
	//이미 코드가 되어있는 상태라면 throws를 붙이는게 편하고(유지보수)
	//아직 코드가 없는 상태에서는 try~catch가 더 편하다.(실제개발시)
	public static void main(String[] args)throws ClassNotFoundException {
//		createClass();  //반드시 예외처리를 해야함
		//try~catch?  선언 throw?
		try {
			MainClass2 m = createClass();
			m.name = "홍길동";
			System.out.println(m.name);
		}catch(Exception e) {}
	}

}
