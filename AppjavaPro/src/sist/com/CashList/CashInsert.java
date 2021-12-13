package sist.com.CashList;

public class CashInsert {
	
	private int inCome;
	private int remain;
	private int outCome;
	private String whatFor;
	int index;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getInCome() {
		return inCome;
	}
	public void setInCome(int inCome) {
		this.inCome = inCome;
	}
//	public int getRemain() {
//		return remain;
//	}
//	public void setRemain(int remain) {
//		this.remain = remain;
//	}
	
	public void countRemain(int inCome, int outCome) {
		if(inCome >0 && outCome == 0) {
			remain += inCome;
		}
		if(inCome==0 && outCome >0) {
			remain -=outCome;
		}
	}
	
	public int getOutCome() {
		return outCome;
	}
	public void setOutCome(int outCome) {
		this.outCome = outCome;
	}
	public String getWhatFor() {
		return whatFor;
	}
	public void setWhatFor(String whatFor) {
		this.whatFor = whatFor;
	}
	
	public void disp() {
		System.out.println("번호 \t  항목  \t  수입  \t  지출  \t  잔액");
		
		System.out.println(index + "\t | " + whatFor + "\t | " + inCome + "\t | " + outCome + "\t | " + remain + "\t | ");
		
	}
	public static void main(String[] args) {
		CashInsert c = new CashInsert();
		c.disp();
	}

}
