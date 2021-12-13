package sist.com.basic2;
//String, StringBuffer, StringBuilder
public class ObjectEx7 {
	
	public void objectPro1() {
		String s1=new String(new byte[] {97,98,99,100});
		String s2=new String("Ajax");
		System.out.println(s1);
		for(byte b:s2.getBytes()) {
			System.out.println(b);
		}
		//s1.getBytes();
		char []c= new char[10];
		s1.getChars(0, 2, c, 0);
		System.out.println(c);
	}
	
	public void objectPro2() {
		String s1="abc";  //암시적
		String s2=new String("defd");  //명시적
		s1.concat("입니다");
		System.out.println(s1.concat("입니다"));
//		System.out.println(s1);
		System.out.println(s1.charAt(1));
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.codePointBefore(1));
		System.out.println(s1.indexOf("a"));
		System.out.println(s2.indexOf("d",1));
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.endsWith("a"));
	}
	
	public void objectPro3() {
		String s1 = "Abc#Def#Ghi";
		String []strArray=s1.split("#");
		for(String s:strArray) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		ObjectEx7 o = new ObjectEx7();
	//	o.objectPro1();
		o.objectPro2();
	//	o.objectPro3();
	}

}
