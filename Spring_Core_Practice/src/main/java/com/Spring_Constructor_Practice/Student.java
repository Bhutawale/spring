package com.Spring_Constructor_Practice;

public class Student 
{
	private int sid;
	private String sname;
	private Course scourse;
	
	public Student(int sid, String sname, Course scourse) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scourse = scourse;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scourse=" + scourse + "]";
	}
	
	
}
