package com.Spring_Core_practice;

public class Employee 
{
	private int eid;
	private String ename;
	private Address eaddress;
	
	public Employee(int eid, String ename, Address eaddress) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public Address getEaddress() {
		return eaddress;
	}
	public void setEaddress(Address eaddress) {
		this.eaddress = eaddress;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
	}
	
	
}
