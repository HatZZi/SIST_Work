package com.sist.main;

import javax.swing.text.Document;

public class MainClass5 {
	
/*	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			System.out.println(doc.toString());
			Elements title = doc.select("a.title");
					for (int i = 0; i < title.size(); i++) {
						System.out.println((i+1)+"."+title.get(i).text());
					}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	*/
	
	//catch => 복구가 가능
	//throws => 복구는 불가능하고 에러만 확인가능.
	//====================================
	//둘의 공통점은 에러가 발생해도 정상적으로 종료를 할 수 있다.
	
	
	public static void main(String[] args) throws Exception{
		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		System.out.println(doc.toString());
		Elements title = doc.select("a.title");
				for (int i = 0; i < title.size(); i++) {
					System.out.println((i+1)+"."+title.get(i).text());
				}
		
	}

}
