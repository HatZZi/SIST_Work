package com.sist.food;
import java.io.*;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
//카테고리 => 파일저장 => 클라이언트 전송(ArrayList => 파일)
//맛집정보 => 파일저장 => 클라이언트 전송(ArrayList => 파일)
public class foodSystem {
	public static void main(String[] args) {
		foodSystem f = new foodSystem();
	}
	//1.실행 => 파일저장
	//1-1초기화블록 -> 시작과 동시에 수행이 가능
	//1-2생성자 -> 시작과 동시에 호출
	/*
	 *   멤버변수의 초기화
	 *   시작과 동시에 작업
	 *   => 둘을 동시에 하는것이 초기화블록, 생성자
	 *                      =======  =====호출을 해야 실행
	 *                      클래스가 로드된경우 자동실행
	 *      초기화블록
	 *      {
	 *        //인스턴스 초기화 블록
	 *      }
	 *      static
	 *      {
	 *        //정적블록
	 *      }
	 *      ***클래스블록은 구현은 못하고 선언과 동시에 값을 설정하는것만 가능하다
	 *      
	 *      초기화
	 *      1. 명시적 초기화 : private int a = 10;
	 *      ===================================
	 *      2. 초기화블록
	 *      3. 생성자
	 *      ================구현(파일읽기,파일저장...외부데이터읽기)
	 */
	public foodSystem() {
		try {
			Document doc = Jsoup.connect("https://www.mangoplate.com/").get();
			Elements title = doc.select("div.top_list_slide span.title");
			Elements subject = doc.select("div.top_list_slide p.desc");
			
			StringBuffer sb = new StringBuffer();
			
			for (int i = 0; i < title.size(); i++) {
				System.out.println(title.get(i).text());
				System.out.println(subject.get(i).text());
				System.out.println("\n");
				String data = (i+1)+title.get(i).text()+"|"+subject.get(i).text()+"\n";
				sb.append(data);
			
			}
			File file = new File("/Users/namjiwon/Downloads/java_data/category.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			//파일에 카테고리 저장하기
			FileWriter fw = new FileWriter(file);
			fw.write(sb.toString());
			fw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//2.사용자가 요청 => 파일읽어와서 => ArrayList에 저장후 전송

}
