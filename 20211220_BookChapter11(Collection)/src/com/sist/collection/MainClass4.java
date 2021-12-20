package com.sist.collection;
// interface => 구현된 클래스
// List => ArrayList
// Set => HashSet
// Map => HashMap
import java.util.*;
//Stack / Queue ==>사용빈도는 거의 없다.
/*
 *   Stack => LIFO (LastIn, FirstOut)
 *            나중에 들어간 데이터가 먼저 출력(메모리)
 *   Queue => FIFO (FirstIn, FirstOut)
 *            먼저 들어간 데이터가 먼저 출력
 *            
 *   public static void main(String[] args) {
         int a = 10;
         if(a==10){
            int b=20;
            if(b==20);{
               int c = 30;
            } //c변수가 메모리에서 사라진다
         }//b변수가 사라진다
	}//a변수가 사라진다
 *
 *   => 메모리 구조
 *   ============================
 *     Method 영역 / static
 *   ============================
 *     Stack : 지역변수, 매개변수 ==> 메모리에서 관리{}이 공료하면
 *                               지동으로 사라지는 변수
 *                               메모리에 저장시점 => 메소드호출
 *   ============================
 *     heap : 멤버 변수 (new 사용해서 사용자정의 메모리 요청)
 *            개발자 관리 영역(new, delete)
 *                              ------- 사용하지않으면 가비지컬렉션이 자동회수
 *     new 연산자 => 리턴형 int(주소)
 *     A클래스의 메모리크기를 확인 => 메모리를 만들어준다 (new)
 *     malloc(A) ==>승격(연산자)
 *     A a = new A();
 *           === ===저장된데이터 초기화
 *           저장된 메모리주소를 넘겨준다(메모리주소는 int범위를 벗어나지 않음)
 *   ============================
 */
//604page의 그림 확인
/*      Stack
 *      = 저장 : push()
 *      = 추출 : pop()
 *      = 데이터 유무 : isEmpty()
 *      Queue
 *      = 저장 : opper()
 *      = 추출 : poll()
 *      = 데이터 유무 : isEmpty()
 * 
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]names = new String[5];
		//메모리 크기가 더 필요하면 String[]nmaes2=new String[10]으로 복사
		//가변(크기를 조절할 수 있다) => 컬렉션
		names[0] = "홍길동";
		names[1] = "심청이";
		names[2] = "박문수";
		names[3] = "이순신";
		names[4] = "강감찬";
		//출력 Stack
		System.out.println("=====Stack=====");
		for(int i = names.length-1; i>=0; i--) {
			System.out.println(names[i]);
		}
		//출력 Queue
		System.out.println("=====Queue=====");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//Stack사용
		Stack st = new Stack();  
		//스텍에 데이터 추가 => push()
		st.push("사과");
		st.push("포도");
		st.push("수박");
		st.push("오렌지");
		st.push("메론");
		//스텍에서 데이터 추출=> pop()
		if(!st.isEmpty()) {  //스텍안에 데이터가 있다면!!
			while(!st.isEmpty()) {    //인덱스번호가 없기때문에 while사용
				System.out.println(st.pop());
			}
		}else {
			System.out.println("데이터가 존재하지 않습니다!");
		}
		System.out.println("===========Queue===========");
		Queue queue = new LinkedList(); // Queue생성할때는 LinkedList를 사용.
		//Queue는 인터페이스 => 미완성된 클래스(자신이 new를 이용해서 메모리할당 불가능)
		//데이터추가 offer(), 데이터추출 poll()
		queue.offer("홍길동");
		queue.offer("심청이");
		queue.offer("춘향이");
		queue.offer("김두한");
		queue.offer("박문수");
		
		System.out.println("======출력======");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
