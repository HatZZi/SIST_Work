package com.sist.main;
//객체단위로 읽기
//ObjectInputStream
import java.io.*;
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//파일을 읽어서 어레이리스트에 대입
			FileInputStream fis = 
					new FileInputStream("/Users/namjiwon/Downloads/java_data/movie_object.txt");
			//객체단위로 읽어온다
			ObjectInputStream ois =
					new ObjectInputStream(fis);
			ArrayList<Movie>list = (ArrayList<Movie>)ois.readObject();
			
			fis.close();
			ois.close();
			
			//어레이리스트에 있는 데이터를 출력해보기
			for(Movie m:list) {
				System.out.println("영화번호: "+m.getMno());
				System.out.println("영화제목: "+m.getTitle());
				System.out.println("감독: "+m.getDirector());
				System.out.println("출연: "+m.getActor());
				System.out.println("장르: "+m.getGenre());
				System.out.println("등급: "+m.getGrade());
				System.out.println("개봉일: "+m.getRegdate());
				System.out.println();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
