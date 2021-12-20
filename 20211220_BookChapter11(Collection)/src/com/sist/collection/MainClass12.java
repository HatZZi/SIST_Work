package com.sist.collection;
//TreeSet => 문자열저장 (중복된 데이터는 저장이 불가능)
import java.util.*;
public class MainClass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet(); // ArrayList, HashSet, HashMap
		String[]names = {"홍길동", "심청이", "춘향이", "박문수", "이순신","김두한"
				          ,"강감찬", "을지문덕", "전봉준", "세종"};
		for(Object name:names) {
			set.add(name);
		}
		System.out.println("=====TreeSet에 데이터가 추가된 상태=====");
		System.out.println(set.toString());
		System.out.println("첫번째 데이터: "+ set.first());
		System.out.println("마지막 데이터: "+ set.last());
		System.out.println(set.headSet("박")); //괄호안은 포함되지않음
		System.out.println(set.tailSet("박")); //괄호안도 포함됨
		
	}

}
