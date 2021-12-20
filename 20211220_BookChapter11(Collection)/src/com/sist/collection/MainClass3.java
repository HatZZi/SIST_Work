package com.sist.collection;

import java.util.LinkedList;

//LinkedList
/*                  읽기    추가/삭제    비고
 *    ===================================
 *    ArrayList    빠르다    느리다    순차적인경우에는
 *                                 추가, 삭제속도가 빠르다.
 *    ===================================
 *    LinkedList   느리다    빠르다    데이터가 많을수록
 *                                 접근성이 떨어진다.
 *    ===================================
 *    
 *    List 인터페이스를 구현한 클래스가 LinkedList
 *    ====
 *    추가 => add(Object)
 *    수정 => set(int index, Object obj)
 *    삭제 => remove(int index)
 *    읽기 => get(int index)
 *    데이터갯수 => size()
 *    데이터유무확인 => isEmpty()
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 데이터저장공간 확보
		LinkedList list = new LinkedList();
		//Vector, ArrayList
		//2. 데이터 추가
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);  //추가하는 순서로 인덱스번호가 자동으로 설
		
		System.out.println("추가된 데이터 갯수: "+ list.size());
		/*
		 * Integer i = 10 : 오토박싱
		 * int i = new Integer(10) : 언박싱
		 * =============================== Wrapper
		 * Object o = 10;
		 * int i = (int)o;
		 * ==============일반데이터형도가능 
		 */
		// 추가된 데이터 출력
		for (int i = 0; i < list.size(); i++) {
			int num = (int)list.get(i);
			System.out.println(i+":=>"+num);
		}
		
		// 삭제
		System.out.println("======데이터 삭제======");
		list.remove(3);
		System.out.println("삭제 후 데이터 갯수: "+ list.size());
		//삭제된 데이터 출력
		for (int i = 0; i < list.size(); i++) {
			int num = (int)list.get(i);
			System.out.println(i+":=>"+num);
		}
		// 반복적인 부분 => 메소드 처리
		//수정
		System.out.println("======데이터 수정======");
		list.set(2, 5000);
		System.out.println("수정 후 데이터 갯수: "+ list.size());
		for (int i = 0; i < list.size(); i++) {
			int num = (int)list.get(i);
			System.out.println(i+":=>"+num);
		}
		
		//전체 삭제
		System.out.println("======전체 삭제======");
		list.clear();
		System.out.println("전체삭제 후 데이터 갯수: "+ list.size());
		if(list.isEmpty()) { //데이터가 없으면 true
			System.out.println("데이터가 존재하지 않습니다!!");
		}
		// ArrayList = vector = LinkedList
		/*  add()
		 *  remove()
		 *  set()
		 *  size()
		 *  get()
		 *  isEmpty()
		 *  clear()
		 *  
		 *  584페이지~603페이지
		 */

	}

}
