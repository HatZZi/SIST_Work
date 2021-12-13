package sist.com.basic2;

public class ObjectEx8 {
	//이름, 나이, 오늘생일, 성별, 지역, 띠, 전화번호
	public void stringProcess() {
		String[]data = {"남지원#881210-1010547#031)457-1280",
						"최미래#981201-2012947#02)457-1980",
						"최은영#990210-2010547#061)957-1280",
					    "김인수#580510-1010547#02)657-9280"	};
		
		for (int i = 0; i < data.length; i++) {
			String [] splitData = new String [1];
			splitData[0] = data[i];
			System.out.printf(getName(splitData));
		}
		
	}
	
	public String getName(String[]splitData) {
		String indivisual = splitData[0];
		String[]makeDivide = indivisual.split("#");
		return makeDivide[0];
		
	}
	
	public static void main(String[] args) {
		ObjectEx8 o = new ObjectEx8();
		o.stringProcess();
	}

}
