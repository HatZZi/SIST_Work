package sist.com.basic;

public class FontMain {

	static String nation;
	
	public static void main(String[] args) {
		new Font1().fontFace = "굴림";  // fontFace굴림 | size | color
		new Font1().fontFace = "궁서";  // fontFace궁서 | size | color
		System.out.println(new Font1().fontFace);  // fontFace null | size | color
		nation="우간다";
		System.out.println(Font1.nation);
		System.out.println(Font1.WEIGHT);
		System.out.println(Integer.MIN_VALUE);
	}

}
