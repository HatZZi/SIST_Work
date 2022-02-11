package com.sist.music;
//사용자 요청 => 처리후 응답
import java.util.*;
import java.io.*;
public class MusicSystem {
	//음악정보 ==> 전체를 가지고 있다(공유) => static으로 가야한다
	//음악 1(Music), 음악 전체(ArrayList<Music>
	static private ArrayList<Music>list = new ArrayList<Music>();
	//초기화를 해서 ArrayList에 값을 채우고 시작
	static {
		try {
			//파일에 읽는다 => 객체단위로 변환 ==> ArrayList에 대입
			FileInputStream fis =
					new FileInputStream("/Users/namjiwon/Downloads/java_data/music_object.txt");
			ObjectInputStream ois = 
					new ObjectInputStream(fis);
			list = (ArrayList<Music>)ois.readObject();
			
			//파일 닫기
			fis.close();
			ois.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	//사용자 요청 처리
	//목록 요청
	public ArrayList<Music>musiclistData(int page){
		ArrayList<Music>mlist = new ArrayList<Music>();
		int j = 0; //열개씩 잘라주는 변수
		int pagecnt =  (page*10)-10; //처음을 잡아준다. 0-9 10-19 20-29....
		
		for (int i = 0; i < list.size(); i++) {
			Music m = list.get(i);
			if(j<10 && i>=pagecnt) {
				mlist.add(m);
				j++;
			}
		}
		
		
		return mlist;
	}
	public int musicTotalPage() {
		return (int)(Math.ceil(list.size()/10.0));
		//총페이지 구할때 => 올림메소드를 이용한다 => ceil()
	}
		//제목 찾기 요청
	public ArrayList<Music> titleFindData(String title){
		ArrayList<Music>mlist = new ArrayList<Music>();
		for(Music m : list) {
			if(m.getTitle().contains(title)){
				mlist.add(m);
			}
		}
		return mlist;
	}
		//등폭이 가장 많은 음악
	public ArrayList<Music>musicMaxData(){
		ArrayList<Music>mlist = new ArrayList<Music>();
		//등폭 확인
		int max = 0;
		for(Music m:list) {            //가장 큰 등폭은 얼마인가
			if(max<m.getIdcrment()) {
				max = m.getIdcrment();
			}	
		}
		for(Music m:list) {           //그 등폭을 가진 음악 목록
			if(m.getIdcrment()==max) {
				mlist.add(m);
			}
		}
		return mlist;
	}
		
	
		//가수명으로 찾기
	public ArrayList<Music> singerFindData(String singer){
		ArrayList<Music>slist = new ArrayList<Music>();
		for(Music m:list) {
			if(m.getSinger().contains(singer)) {
				slist.add(m);
			}
		}
		return slist;
	}
		//상세보기 요청
	public Music musicDetailData(int no) {// => 번호는 1번부터 시작
		Music m = list.get(no-1);     // => 인덱스는 0번부터 시작
		return m;
	}
}
