package com.sist.main;
//finally => close(), 파일,서버,데이터베이스
//try,catch와 관련없이 무조건 수행하는 문장
import java.io.*;
public class MainClass4 {

	/*public static void main(String[] args) {
			throws FileNotFoundException,IOException {
		//파일읽기
		FileReader fr = new FileReader("/Users/namjiwon/Downloads/쌍용자료모음/movieinfo.txt");
		int i = 0; //읽은 데이터 => char(ASC)
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}*/
	
	
	/*public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr=new FileReader("/Users/namjiwon/Downloads/쌍용자료모음/movieinfo.txt");
		}catch(FileNotFoundException e) {}
		catch(IOException e) {}  //평상시에는 사용빈도가 낮다(데이터베이스, 네트워크, 파일프로그램)
		finally {
			try {
			fr.close();
			}catch(IOException ex) {}
		}
	}*/
	//437페이지
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("/Users/namjiwon/Downloads/쌍용자료모음/movie.txt")){
			int i=0;
			while((i = fr.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(FileNotFoundException e) {}  //try블럭을 벗어나면 자동으로 close()가 호
		catch(IOException e) {}
		
	}
	
}
