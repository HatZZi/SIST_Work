package com.sist.lib;
import java.io.FileReader;
//StringBuffer / StringBuilder
//   동기화           비동기화
// 데이터 수집 => 나머지는 String
import java.util.*;
public class MainClass11 {

	public void stringUse() {
		String movie = "";
		long start = System.currentTimeMillis();
		//파일 읽기
		//IOException ==> CheckException
		try {
			FileReader fr = new FileReader("/Users/namjiwon/Downloads/쌍용자료모음/movieinfo.txt");
			int i = 0;
			while((i=fr.read())!=-1) {
				movie+=String.valueOf((char)i);
			}
			fr.close();
			System.out.println(movie);
		}catch(Exception e){
			long end = System.currentTimeMillis();
			System.out.println("수행시간:"+(end-start)); //수행시간 구하기
			
		}
		
	}
	public void stringBufferUse() {
		StringBuffer sb = new StringBuffer();
		long start = System.currentTimeMillis();
		//파일 읽기
		//IOException ==> CheckException
		try {
			FileReader fr = new FileReader("/Users/namjiwon/Downloads/쌍용자료모음/movieinfo.txt");
			int i = 0;
			while((i=fr.read())!=-1) {
				movie+=String.valueOf((char)i);
			}
			fr.close();
			System.out.println(movie);
		}catch(Exception e){
			long end = System.currentTimeMillis();
			System.out.println("수행시간:"+(end-start)); //수행시간 구하기
			
		}
		
	}
	public static void main(String[] args) {
		
		MainClass11 m = new MainClass11();
		m.stringUse();
		
	}

}
