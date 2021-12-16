package com.sist.lib;
import java.util.*;
import java.text.*;
public class MainClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10명의 점수를 받아서 학점을 출력 => 90이상 A, 80이 B, 70이상 C ....
		// ChoiceFormat
		double[]hak= {50,60,70,80,90};
		//50~59 , 60~69 , 70~79 , 80~89 , 90~99  범위 지정
		double[]student = new double[10];
		Random r = new Random();
		for (int i = 0; i < student.length; i++) {
			student[i] = r.nextInt(51)+50;
		}
		//출력
		for(double i:student) {
			System.out.print(i + " ");
		}
		System.out.println();
		String[]score = {"F", "D", "C", "B", "A"};
		ChoiceFormat cf = new ChoiceFormat(hak,score);
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]+ "=>"+cf.format(student[i]));
		}
		
//		for( int i:student) {
//			char c = 'A';
//			if(i>=90)
//				c = 'A';
//			else if(i>=80)
//				c = 'B';
//			else if(i>=70)
//				c = 'C';
//			else if(i>=60)
//				c = 'D';
//			else
//				c = 'F';
//			System.out.println(i+ "=>" +c);
//		}
	}

}
