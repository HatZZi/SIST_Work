package sist.com.basic3;

public class ObjectDemo extends Object{
	
	public void inheritanceEx1() {
		String s = new String();
		Object o = (Object)s; //Upcast
		s = (String)o;  //Downcast
		s.concat("");
	}
	
	public void inheritanceEx2(Object obj) {
		if(obj instanceof String) {
			System.out.println(((String)obj).charAt(0));  //DownCast		
		}
		if(obj instanceof ObjectDemo) {
			((ObjectDemo)obj).inheritanceEx1();
		}
	}
	
	public static void main(String[] args) {
		ObjectDemo o = new ObjectDemo();
		o.inheritanceEx2(new String("abc"));
		o.inheritanceEx2(o);  //형변환을 올바르게 하지 않으면 오류가 뜬다.
	}

}
