package com.sist.lib;
// substring => 문자열 자른다
/*
 * substring (int start) : 시작점부터 끝까지 문자열을 자르는 경우
 * substring (int start, int end) : 중간에 문자열을 자르는 경우
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="경기도 남양주시 두물로27번길 38-16 1F 지번 경기도 남양주시 별내동 947-4 1F";
		//1.길주소만 자르기
		String addr = address.substring(0,address.indexOf("지"));
		//주의점 substring(int s, int e)
		//            시작======  ======끝 => 시작~e-1까
		System.out.println(addr);
		//2.지번 자르기
		addr = address.substring(address.lastIndexOf("지번")+2);
		System.out.println(addr.trim());
		//3.남양주시만 자르기
		String s = address.substring(address.indexOf(" ")+1);
		System.out.println(s);
		String s2 = s.substring(0, s.indexOf(" "));
		System.out.println(s2);
		
	}

}
