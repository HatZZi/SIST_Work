package sist.com.basic5;

public class HumanMain {
	Human h;
	public void process(int data) {
		if(data>=10) {
			h = new Student();
		}else {
			h = new Doctor();
		}
		h.think();
	}
	
	
	public static void main(String[] args) {
		
//		Student s = new Student();  // (Student ( Human() ) )
//		s.think();
		
//		Human h = new Doctor();
//		h.think();  // 닥터생각
//		h = new Student();
//		h.think();  // 학생생각
		
		HumanMain h = new HumanMain();
		h.process(100);
	}

}
