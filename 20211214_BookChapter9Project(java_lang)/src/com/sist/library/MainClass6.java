package com.sist.library;
//*** contains() => 문자열중에 포함되었는지 여부 =LIKE
// 원형) public boolean contains(String word) = 자바스크립트(SearchBar)
import java.util.*;

import javax.swing.text.Document;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
//==>영화추천 ==> 블로그, 카페에서 입력글을 읽는다. => 실시간(트위터)
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어 입력: ");
		String fd = sc.next();
		//2. 찾기 => contains
		try {
			org.jsoup.nodes.Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			//사이트에 접근해서 모든 데이터를 읽어와라
			Elements elem = doc.select("div.wrap_song_info a");
			for (int i = 0; i < elem.size(); i++) {
				String ss = elem.get(i).text(); //노래제목
				if(ss.contains(fd)) {
					System.out.println(ss);
				}
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();//에러확인
		}
		
		//3. 찾은 결과를 보여준다.

	}

}
