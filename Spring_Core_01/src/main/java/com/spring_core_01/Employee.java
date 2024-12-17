package com.spring_core_01;

public class Employee
{
	private int eid;
	private String ename;
	private long ephone;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getEphone() {
		return ephone;
	}
	public void setEphone(long ephone) {
		this.ephone = ephone;
	}
	public Employee(int eid, String ename, long ephone) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ephone = ephone;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ephone=" + ephone + "]";
	}
	
	
}
