package sist.com.basic3;

//Inheritance ( 상속 ) --> 개체를 유기적으로 연결.(협업,조립)관계설정, is a, has a
//자바는 단일상속.
//extends(연장,확장), super(선조), child(자손)
public class ObjectProcess extends Object {
	
	public ObjectProcess() {
	//	Object o = new ObjectProcess();   //다형성을 시사
	//	ObjectProcess o = new Object();
	}
	public void objectAction() {
		System.out.println(this.equals(this));
		System.out.println(this.hashCode());
		System.out.println(new ObjectProcess().hashCode());
		System.out.println(this.getClass());
		System.out.println(getClass().getName());
		System.out.println(Integer.toHexString(this.hashCode()));
	}
	public static void main(String[] args) {
		new ObjectProcess().objectAction();
		ObjectProcess o = new ObjectProcess();
		o.objectAction();
	}

}
