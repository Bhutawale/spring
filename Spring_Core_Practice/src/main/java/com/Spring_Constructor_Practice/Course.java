package com.Spring_Constructor_Practice;

public class Course 
{
	private int cid;
	private String cname;
	
	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
}
