package sist.com.basic2;

import java.util.Calendar;


public class Birthday {
//	String []data={"주석영#881202-1010547#031)457-1280"};
//	String []res=data[0].split("#");
	
	
	public boolean getCal(String res) {
		String dateString = Integer.toString(Calendar.getInstance().get(Calendar.DATE));
		String monthString = Integer.toString(Calendar.getInstance().get(Calendar.MONTH)+1);

		if(Calendar.getInstance().get(Calendar.DATE)<10) {

			dateString = 0 + dateString;

		}
		if(Calendar.getInstance().get(Calendar.MONTH)<10) {
			monthString = 0 + monthString;
		}
		
		String birthDay = monthString + dateString;

//		System.out.println(birthDay);
//		System.out.println(res[1].substring(2, 6));
		
		if(res.substring(2,6).equals(birthDay))return true;
		else return false;

	
	}
	
	public static void main(String[] args) {
		Birthday b = new Birthday();
//		System.out.println(b.getCal("981202-1012947"));

	}

}
