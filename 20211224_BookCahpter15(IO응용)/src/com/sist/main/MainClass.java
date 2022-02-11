package com.sist.main;
//ArrayList단위로 파일을 저장 ==> 저장 활용
import java.io.*;
import java.util.*;

//영화 한개에 대한 데이터 모아서사용(사용자 정의 데이터형)=>캡슐화
class Movie implements Serializable{
	private int mno;
	private String title;
	private String genre;
	private String poster;
	private String actor;
	private String regdate;
	private String grade;
	private String director;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일을 읽어서 => ArrayList에 저장
		//ArrayList => 통째로 파일에 저장
		ArrayList<Movie>list = new ArrayList<Movie>();
		//파일을 읽기 => 예외처리
		try {
			
			FileInputStream fis = 
					new FileInputStream("/Users/namjiwon/Downloads/java_data/movieinfo.txt");
			BufferedReader br =
					new BufferedReader(new InputStreamReader(fis));
			//byte => char로 변환 : InputStreamReader
			while(true) {
				String data = br.readLine();
				if(data==null)break;
				// | => 데이터를 잘라온다 ==> Movie => ArrayList
				//split(), StringTokenizer
				StringTokenizer st = new StringTokenizer(data,"|");
				Movie m = new Movie();
				m.setMno(Integer.parseInt(st.nextToken()));
				m.setTitle(st.nextToken());
				m.setGenre(st.nextToken());
				m.setPoster(st.nextToken());
				m.setActor(st.nextToken());
				m.setRegdate(st.nextToken());
				m.setGrade(st.nextToken());
				m.setDirector(st.nextToken());
				
				list.add(m);
			}
			fis.close();
			br.close();
			
//			//데이터가 추가가 되었는지 확인
//			for(Movie m:list) {
//				System.out.println("번호: "+m.getMno());
//				System.out.println("제목: "+ m.getTitle());
//			}
			
			//ArrayList단위로 저장 파일 => 계속 활용이 가능
			//1.파일 => 파일 생성
			File file = 
					new File("/Users/namjiwon/Downloads/java_data/movie_object.txt");
			//파일 존재 여부 확인
			if(!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fos =
					new FileOutputStream(file);
			ObjectOutputStream oos =
					new ObjectOutputStream(fos);
			oos.writeObject(list);//겍체단위로 저장
			fos.close();
			oos.close();
			System.out.println("객체단위저장완료!");
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
