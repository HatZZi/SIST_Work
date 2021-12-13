package sist.com.basic2;

public class Location {
	//"주석영#881210-1010547#031)457-1280"
	
	public String getLocation(String data) {
		
//		String []telephone = data.split(")");
		
		if(data.startsWith("031")) {
			return "경기도";
		}
		if(data.startsWith("02")) {
			return "서울";
		}
		if(data.startsWith("061")) {
			return "전라남도";
		}
		
		return null;
		
	}
	
	public void disp() {
		System.out.println(getLocation("031)457-1280"));
	}
	
	public static void main(String[] args) {
		Location l = new Location();
		l.disp();
	}

}
