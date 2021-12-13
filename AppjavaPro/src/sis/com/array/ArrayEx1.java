package sis.com.array;
//배열은 같은 기억장소의 모임이다.
public class ArrayEx1 {
	public void arrayEx1() {
		int []m1 = new int [5];  //메모리 Heap에 [][][][][] 할당  m1은 변수이기때문에 stack
		m1[0] = 10; 
		m1[1] = 20; 
		m1[2] = 30; 
		m1[3] = 40; 
		m1[4] = 50; 
		//System.out.println(m1[0]);
		//System.out.println(m1[1]);
		//System.out.println(m1[2]);
		//System.out.println(m1[3]);
		//System.out.println(m1[4]);
		
		for (int i=0; i<m1.length; i++) {
			System.out.printf("m[%d]=%-3d",i, m1[i]);
		}
	}
	
	public void arrayEx2() {
		int []m = {10,20,30,40,50,60,70,80};
		for(int i=0; i<m.length;i++) {
			System.out.printf("%-5d", m[i]);
		}
		System.out.println();
		
		int j = 0;
		while(j<m.length) {
			System.out.printf("%-5d", m[j++]);
		}
		System.out.println();
		
		int k=0;
		do {
			System.out.printf("%-5d", m[k++]);
		}while(k++<m.length);
		System.out.println();
	}
	
	public void arrayEx3() {
		int a = 100;    //a는 하나의 정수를 받는 메모리
		//a = new int [5];//배열은 한번에 다섯개 
		int []m;        //지역변수 m은 주소변수 Stack
		m=new int[5];   //Heap 
		m[0] = 10;
		m[1] = 20;
		//System.out.println(m[0] + " " + m[1]);
		(new int[5])[0] = 10; //new int가 생성.
		(new int[5])[1] = 10; //새로운 new int 메모리가 또 생성된다.
		System.out.println((new int[5])[0]); //
	}
	
	public int[] arrayEx4() {
		//double []dm = new double[5]; //5개의 엘리먼트가 Heap에 만들어짐.
		int []a = new int[10]; //1차원
		//int a = new int[10]; 에러난다
		return a;
	}
	
	public static void main(String[] args) {
		ArrayEx1 a = new ArrayEx1();
		System.out.println(a.arrayEx4()[0]);
	}

}
