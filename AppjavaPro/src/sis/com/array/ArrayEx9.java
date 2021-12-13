package sis.com.array;

import java.util.Random;
import java.util.Scanner;

//SelectionSort (선택정렬)
public class ArrayEx9 {
	Scanner sc = new Scanner(System.in);
	int []m = new int [10];  //위에 선언된것은 모든곳에서 사용이 가능하다.
	
	public void initArray() {
		Random random = new Random();
		for(int i = 0; i < m.length; i++) {
			m[i] = random.nextInt(100);
		}
		
//		random.nextInt(10);//10을 제외한 그 안의 랜덤숫자 1개 출력
//		System.out.println(random.nextInt(10));
//		System.out.println(random.nextBoolean());
	}
	
	public void swap(int i, int j) {
		int temp = 0;
		temp = m[i];
		m[i] = m[j];
		m[j] = temp;
	}
	
	public void orderSet() {
		System.out.println("오름차순은 1번, 내림차순은 0번을 눌러주세요!");
		int order = sc.nextInt();
		selectionSort(order);
	}
	
	public void selectionSort(int order) {
		for(int i = 0; i<m.length-1; i++) {     //다 안돌아도 되기때문에 -1
			for(int j = i+1; j <m.length; j++) {
				if(order == 0) {
					if(m[i]<m[j]) {    //내림차순
						swap(i,j);
					}
				} else {
					if(m[i]>m[j]) {    //오름차순
						swap(i,j);
					}
				}
			}
		}
	}

	public void sortDataDisp() {
		for (int i:m) {
			System.out.printf("%3d", i);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayEx9 a = new ArrayEx9();
		a.initArray();
		a.orderSet();
		a.sortDataDisp();
	}

}
