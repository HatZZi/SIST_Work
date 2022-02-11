package com.sist.music;
//임시파일 => 데이터 수집해서 파일에 저장...추후에는 오라클에 저장
//데이터 수집
//어레이리스트에 대입
//어레이리스트를 파일에 저장

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import com.sist.music.*; //사용자 정의 클래스 로딩
//패키지가 다르면 import를 이용해서 필요한 클래스 읽
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//저장공간 만들기
		ArrayList<Music>list = new ArrayList<Music>();
		
		//데이터를 웹에서 읽기
		try {
			//사이트의 데이터 읽어오기 
			int k=1;
			for(int i = 1; i<=4; i++) {
				Document doc = 
						Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20211224&hh=14&rtm=Y&pg="+i).get();
				Elements title = doc.select("td.info a.title");
				Elements singer = doc.select("td.info a.artist");
				Elements album = doc.select("td.info a.albumtitle");
				Elements etc = doc.select("span.rank");
				
				for (int j = 0; j < title.size(); j++) {
					try {
					System.out.println(k);
					System.out.println(title.get(j).text());
					System.out.println(singer.get(j).text());
					System.out.println(album.get(j).text());
					
					String temp = etc.get(j).text();
					String id = temp.replaceAll("[^0-9]", "");
					String state = temp.replaceAll("[^가-힇]", "");
					if(state.equals("유지")) {
						id = "0"; //등폭이 없다
					}

					
					System.out.println("등폭: "+id);
					System.out.println("상태: "+state);
					System.out.println("\n");			
					System.out.println();
					//ArrayList에 저장
					Music m = new Music();
					m.setNo(k);
					m.setTitle(title.get(j).text());
					m.setSinger(singer.get(j).text());
					m.setAlbum(album.get(j).text());
					m.setState(state);
					m.setIdcrment(Integer.parseInt(id));
					list.add(m);
					k++;
					}catch(Exception ex) {};
				}
			}
			//객체 단위 저장
			FileOutputStream fos =
					new FileOutputStream("/Users/namjiwon/Downloads/java_data/music_object.txt");
			ObjectOutputStream oos = 
					new ObjectOutputStream(fos);
			oos.writeObject(list);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
