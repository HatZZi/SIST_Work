package com.sist.main;
//등수
//3명의 학생
//국어,영어,수학 ==> 총점, 평균, 등
import java.util.*;
public class MainClass3 {
	
	public static void main(String[] args) {
		int[]kor = new int[3];
		int[]eng = new int[3];
		int[]math = new int[3];
		int[]total = new int[3];
		double[]avg = new double[3];
		int[]rank = new int[3];
		//double[3][6] hak = new double[3][6];  => 자바에서는 잘 쓰지 않는다
		//3개이상 => 데이터형 같다(배열), 데이터형이 다르다(클래스)
		//int, String, int
		//classA{
		//  int
		//  String
		//  int
		//}
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1)+"번째 국어점수 입력");
			kor[i] = sc.nextInt();
			System.out.print((i+1)+"번째 영어점수 입력");
			eng[i] = sc.nextInt();
			System.out.print((i+1)+"번째 수학점수 입력");
			math[i] = sc.nextInt();
			
			total[i] = (kor[i] + eng[i] + math[i]);
			avg[i] = total[i]/3.0;
			
		}
		//등수 구하기
		for (int i = 0; i < 3; i++) {
			rank[i]=1;
			for (int j = 0; j < 3; j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
		//출력
		for (int i = 0; i < 3; i++) {
			System.out.printf("%-5d%-5d%-5d%-5d%-8.2f%-5d\n",kor[i],eng[i],math[i],total[i],avg[i],rank[i]);
		}
	}

}
