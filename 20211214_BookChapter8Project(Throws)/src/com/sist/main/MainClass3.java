package com.sist.main;
//폴더 => 파일제작 ==> IO => 자바에서 제공하는 라이브러리는 대부분 예외처리를 갖고있다.
//선언 (알림)=>throws, 직접처리=>try~catch
import java.io.*;
/*
 * io(input/output)
 * =>메모리 입출력
 * =>파일 입출력
 * =>네트워크 입출력
 */
// 433page
public class MainClass3 {
	
	public static void main(String[] args)throws IOException {
		File dir = new File("경로~~~~~");
		if(!dir.exists()) {  //폴더가 존재하지 않으면
			dir.mkdir();
		}
		
		File file = new File("경로~~~~~");
		if(!file.exists()) {
			file.createNewFile();  //예외처리가 필요한 메소드!!
		}
		System.out.println("생성 완료!!");
		
		file.delete();
		dir.delete();
		System.out.println("삭제 완료!!");
	}

}
