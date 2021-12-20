package com.sist.collection;
//Set => TreeSet
import java.util.*;
/*
 *  ArrayList, HashSet, HashMap ==> 웹에서 사용
 */
public class MainClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		// 데이터 추가
		set.add(80);
		set.add(100);
		set.add(70);
		set.add(85);
		set.add(87);
		set.add(92);
		set.add(90);
		set.add(83);
		System.out.println("가장 낮은 점수: ");
		int min = 100;
		for(Object score:set) {
			int a = (int)score;
			if(min>a) {
				min = a;;
			}
		}
		System.out.println("가장 낮은 점수: "+set.first());
		System.out.println("가장 높은 점수: ");
		int max = 0;
		for(Object score:set) {
			int a = (int)score;
			if(max<a) {
				max = a;;
			}
		}
		System.out.println("가장 높은 점수: "+set.last());
		System.out.println(set.lower(90)); //90점 바로 아래
		System.out.println(set.higher(90)); //90점 바로 위
		System.out.println(set.floor(98)); //98이거나 바로 아래
		System.out.println(set.ceiling(97)); //98이거나 바로 위
		
		NavigableSet d = set.descendingSet(); //내림차순
		System.out.println(d.toString());
		NavigableSet a = d.descendingSet(); //올림차순
		System.out.println(a.toString());
		
	}

}
