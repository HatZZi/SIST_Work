package com.sist.exception;
//Check Exception ==> 컴파일러가 감시
import java.io.*;
import java.net.*;
//예외처리를 반드시 한다.
public class MainClass7 {
	
	public static void main(String[] args) {
		try {
			
			//웹사이트 연결
			URL url = new URL("https://sist.co.kr/index.jsp");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			
			if(conn!=null) {  //연결되었다면
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				
				while(true) {
					String s = br.readLine();
					if(s==null) break;
					System.out.println(s);
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();  //422page
		}
	}

}
