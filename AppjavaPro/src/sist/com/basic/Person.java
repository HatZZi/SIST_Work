package sist.com.basic;
//Member, Instance
public class Person {  // private String name;멤버변수, field, state, attribute, data
	
	private String name;
	private static int age;
	private double height;
	//overloading 무리한다 과적한다. 메소드이름은 같고 타입은 달라져야한다.
	
	public void set(String name) {
		this.name = name;  
	}
	
	public void set(String name, int age) {
		set(name);
		this.age = age;
	}
	public void set(String name, int age, double height) {
		set(name,age);
		this.height = height;
	}

	public void disp() {
		System.out.println("name="+this.name+"age="+this.age+"height="+this.height);		
	}
	public static void main(String[] args) {
		//System.out.println(new Person()==new Person());
		Person p1 = new Person();
		Person p2 = new Person();
		
		
		p1.set("지원", 27, 163.5);
		p2.disp();
	}

}
