package sist.com.basic2;

public class Ddi {
	public String findDdi(String data) {
		int birthYear = Integer.parseInt(data.substring(0, 2))+1900;
		switch(birthYear%12) {
		case 0:
			return "원숭이";
			
		case 1:
			return "닭";
			
		case 2:
			return "개";
			
		case 3:
			return "돼지";
			
		case 4:
			return "쥐";
			
		case 5:
			return "소";
			
		case 6:
			return "호랑이";
			
		case 7:
			return "토끼";
		
		case 8:
			return "용";
			
		case 9:
			return "뱀";
		
		case 10:
			return "말";
		
		default:
			return "양";
			
		}
	}

}
