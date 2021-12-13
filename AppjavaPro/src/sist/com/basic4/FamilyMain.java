package sist.com.basic4;

public class FamilyMain {
	public static void main(String[] args) {
//		GrandFather g = new Object(); // g는 레퍼런스타입; Object()
		Object o = new GrandFather();  // GrandFather( Object() )
		Na n =new Na();  //선조들 다 메모리에 생성
		     //    (Na (Father (GrandFather (Object() ) ) )
		
//		o.sleep();   //오브젝트에는 그랜드파더의 속성이 없다.
        ((GrandFather)o).sleep();  //DownCast		
		n.work();
		n.sleep();   //private가 걸리면 접근못한다.  
		//Na에 슬립이 있는가? -> Father에 슬립이 있는가? -> GrandFather에 슬립이 있는가?
		n.game();
		
		Father f = new Father();
		GrandFather gf = new Father();
		gf.sleep();  //Father의 슬립이 나온다. 자손과 선조에 똑같은게 있으면 멤버은폐가 일어남 
		             //선조의 메소드를 은폐하고 자손의 메소드를 호출한다.
		             //원래 선조는 후손의 메소드를 부르지못한다. 하지만 오버라이딩이 있었다면 가능.
	}

}
