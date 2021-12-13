package sist.com.basic;

public class Action {
	
	private String message;
	private int countAction;
	private String actionWhen;
	
	public Action() {
		
	}
	public Action(String message) {
		this.message = message;
		
	}
	public Action(String message, int countAction) {
		this.message = message;
		this.countAction = countAction;
	}
	public Action(String message, int countAction, String actionWhen) {
		this.message = message;
		this.countAction = countAction;
		this.actionWhen = actionWhen;
	}
	
	public Action(Action a1) {
		this.message = a1.message;
		this.countAction = a1.countAction;
		this.actionWhen = a1.actionWhen;
	}
	
	
	public void disp() {
		System.out.println("message : "+message+" countAction : "+countAction+" actionWhen : "+actionWhen);
	}
	
	public static void main(String[] args) {
		Action a1 = new Action("Hello",3,"Meeting"); // message|countAction|actionWhen
		Action a2 = new Action(a1); // message|countAction|actionWhen
		
		a2.disp();
	}

}
