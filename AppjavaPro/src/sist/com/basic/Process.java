package sist.com.basic;

public class Process {
	private int countProcess=10;  //명시적 초기화 explicit
//	countProcess=100;  //클래스는 선언을 하는곳이지 계산을 하는곳이 아니기때문에 안된다!
	private String processWhere="Front";
	private String processWhen="MethodBefore";
	
	public Process() {
		
	}
	public Process(int countProcess) {
		this.countProcess=countProcess;
	}
	
	public void setCountProcess(int )	
	public static void main(String[] args) {
		Process p1 = new Process(500);
		System.out.println(p1.countProcess);
	}

}
