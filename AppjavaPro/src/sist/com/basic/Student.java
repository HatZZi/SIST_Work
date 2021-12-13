package sist.com.basic;

public class Student {
	
	private String name;
	private int age;
	private String stdID;
	private String schoolName;	
	private Score score;
	
	
	
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	public Student() {
		super();
	}
	public Student(Score score) {
		super();
		this.score=score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStdID() {
		return stdID;
	}
	public void setStdID(String stdID) {
		this.stdID = stdID;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String toString() {
	   return "Student [name=" + name + ", age=" + age + ", stdID=" + stdID + ", schoolName=" + schoolName + "]";
	}

}
