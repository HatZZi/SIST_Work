package sist.com.CashList;

import java.util.Scanner;

public class CashMain {
	Scanner sc = new Scanner(System.in);
	String name;
	int income;
	int outcome;
	int index=1;
	CashInsert c = new CashInsert();
	

//	public void setCash() {
//		System.out.println("항목을 입력해주세요.");
//		name = sc.next();
//		System.out.println("수입을 입력해주세요.");
//		income = sc.nextInt();
//		System.out.println("지출을 입력해주세요.");
//		outcome = sc.nextInt();
//	}
	
	public void cashProcess() {
		while(true) {
			System.out.println("항목을 입력해주세요.");
			name = sc.next();
			System.out.println("수입을 입력해주세요.");
			income = sc.nextInt();
			System.out.println("지출을 입력해주세요.");
			outcome = sc.nextInt();	
			
			c.setWhatFor(name);
			c.setInCome(income);
			c.setOutCome(outcome);
			c.setIndex(index);
			c.countRemain(income, outcome);
			c.disp();
			index++;
		}
	}
	
	public static void main(String[] args) {
		CashMain m = new CashMain();
	//	m.setCash();
		m.cashProcess();
	}
}
