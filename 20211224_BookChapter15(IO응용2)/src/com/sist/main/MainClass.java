package com.sist.main;
//클라이언트(브라우저) => 사용자가 보는 곳(Front-End)
import java.util.*;
import com.sist.music.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자 요청 => 해당 페이지 요청
		Scanner sc = new Scanner(System.in);
		MusicSystem ms = new MusicSystem();
		int total = ms.musicTotalPage();
		System.out.print("페이지를 입력하세요(1~20page): ");
		int page = sc.nextInt();
		//해당 페이지의 값을 받아온다
		ArrayList<Music>list = ms.musiclistData(page);
		//받은 데이터 출력
		System.out.println("====="+page+"page 뮤직 목록=====");
		for(Music m:list) {
			System.out.println(m.getNo()+"."+m.getTitle());
		}
		
		System.out.println("=====등폭이 가장 큰 뮤직 목록=====");
		ArrayList<Music>list2 = ms.musicMaxData();
		for(Music m:list2) {
			System.out.println(m.getNo()+"."+m.getTitle()
			+"("+m.getIdcrment()+")");
		}
		System.out.println("=====제목으로 찾기=====");
		System.out.println("제목 입력: ");
		String title = sc.next();
		list.clear();
		list = ms.titleFindData(title);
		for(Music m:list) {
			System.out.println(m.getNo()+"."+m.getTitle());
		}
		System.out.println("=====가수로 찾기=====");
		System.out.println("가수 입력: ");
		String singer = sc.next();
		list.clear();
		list = ms.singerFindData(singer);
		for(Music m:list) {
			System.out.println(m.getNo()+"."+m.getTitle()
			+"("+m.getSinger()+")");
		}
	}

}
