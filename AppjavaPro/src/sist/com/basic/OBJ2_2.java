package sist.com.basic;

public class OBJ2_2 {
	int data;
	static int itStatic;
	final String itStr = "집가고싶다";
	final int value=0;
	
	public String makeChange() {
		//itStr = "어렵다";
		return itStr;
	}
	
	public void makeChange2() {
		int another = 0;
		another++;
		itStatic++;
		data++;
		System.out.println("another="+another+" itStatic="+itStatic+" data="+data);
		System.out.println(itStr);
	}
	
	public static void main(String[] args) {
		OBJ2_2 o1 = new OBJ2_2();
		OBJ2_2 o2 = new OBJ2_2();
		
		System.out.println(o1.makeChange());
	//	o1.itStr = "이게 맞나?";
		//System.out.println(itStr);
		o1.makeChange2();
		o1.makeChange2();
		o1.makeChange2();
		o2.makeChange2();
		o2.makeChange2();
	}

}
