package com.Spring_JDBC.entity;

public class Person 
{
	private int pid;
	private String pname;
	private String pcontact;
	
	public Person(int pid, String pname, String pcontact) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcontact = pcontact;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcontact() {
		return pcontact;
	}
	public void setPcontact(String pcontact) {
		this.pcontact = pcontact;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pcontact=" + pcontact + "]";
	}
	
	
}
