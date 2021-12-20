package com.sist.collection;
// 614page
// 1.Iterator, ListIterator
// => 컬렉션클레스의 데이터에 쉽게 접근하도록 만들어주는 인터페이스
// ArrayList, LinkedList, Vector => 순서(인덱스)가 있다
// Set, Map => 순서가 없다 (루프를 사용하면 => Iterator를 이용해서 데이터 접근)
// Iterator => hasNext() : 데이터가 존재할때까지
// 데이터읽기 =>next() => 순차적으로 데이터읽기가 가능 (빅데이터)

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("시과");
		list.add("배");
		list.add("참외");
		list.add("딸기");
		list.add("복숭아");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
//		System.out.println("======while======");
//		int i = 0;
//		while(!list.isEmpty()) {
//			System.out.println(list.get(i));
//			i++
//		}
		Iterator it = list.iterator(); //Set, Map(인덱스가 없는 컬렉션)
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("====== ListIterator ======");
		ListIterator lt = list.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		System.out.println("===== 역순으로 출력 =====");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
		// 데이터 수집

	}

}
