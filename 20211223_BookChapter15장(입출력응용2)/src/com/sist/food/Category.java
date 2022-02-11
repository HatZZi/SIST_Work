package com.sist.food;
//캡슐화 => 변수(private) : 은닉화, 접근 : 메소드를 통해서 접근(public)

public class Category {
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	private int no;
	private String title;
	private String subject;
}
