package com.sist.collection;
import java.util.*;
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector list = new Vector();
		// 데이터 추가
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		System.out.println("저장된 데이터 갯수: "+list.size());
		// 데이터 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("\n=====Iterator 이용=====");
		Iterator it = list.iterator();
		System.out.println("데이터 출력(0): " + it.next());
		System.out.println("데이터 출력(1): " + it.next());
		System.out.println("데이터 출력(2): " + it.next());
		System.out.println("데이터 출력(3): " + it.next());
		System.out.println("데이터 출력(4): " + it.next());
		
		System.out.println("=====루프 이용=====");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}

}
