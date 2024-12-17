package com.Spring_Autowired_Annotation;

public class Course 
{
	private String cname;
	private int cprice;
	public Course(String cname, int cprice) {
		super();
		this.cname = cname;
		this.cprice = cprice;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCprice() {
		return cprice;
	}
	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
	@Override
	public String toString() {
		return "Course [cname=" + cname + ", cprice=" + cprice + "]";
	}
	
	
}
