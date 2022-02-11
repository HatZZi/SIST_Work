package com.sist.music;
/*
 *  배열의 단점
 *  => 고정적
 *  => 보완 => 가변으로 바꿔준다 (Collection)
 *  컬렉션
 *  => 표준화 => 인터페이스
 *  
 *  List : 순서가 있다(인덱스), 데이터중복을 허용한다 null값 저장 가능
 *         인덱스는 0번부터 순차적으로 유지한다.
 *  Set : 순서가 없다, 중복은 허용하지 않는다 null값 저장 가능
 *  Map : 순서가 없다 ===> Key , Value를 동시에 저장
 *                      Key는 중복이 없지만 Value는 중복이 가능하다
 *  Queue : FIFO(FirstIn,FirstOut)
 *  Stack : LIFO(LastIn,LastOut)
 *  
 *  List
 *  ====
 *  ArrayList , Vector , LinkedList
 *  
 *  ArrayList : Vector의 단점을 보완 => 쓰레드상 데이터 추가할때 비동기적
 *              중간에 데이터를 삭제되면 삭제된 부분을 인덱스를 앞당겨서 채워진다
 *              그렇기 때문에 속도가 느려진다는 단점이 있다 
 *              따라서 수정이나 삭제가 없는경우에 주로 사용한다
 *              
 *  Vector : 쓰레드상 데이터 추가할때 동기적(더 안전하다)
 *  동기?비동기?
 *  동기는 한가지 일을 수행하고 나서 다음 일을 수행하는것.
 *  비동기는 동시다발적으로 수행을 하는것.
 *  
 *  Set: 순서도 없고 중복도 없다 그리고 null값도 저장이 가능하다
 *  ===HashSet->데이터베이스를 다룰경우 해쉬셋을 많이 쓴다
 *              for=each,Iterator를 이용해서 출력한다
 *              한개씩 꺼내온다면 Iterator를 이용하는것이 좋다
 *              Iterator(데이터에 접근해서 한개씩 꺼내온다)
 *     TreeSet->자바 자체에서 관리한다면 트리셋을 더 많이 쓴다
 *     
 *  HashMap / Hashtable
 *  비동기      동기
 *  => 이 두가지는 클래스 관리, 환경설정, 웹에서 주로 사용한다
 *  
 *  
 *  
 */
public class 문제정리 {

}
