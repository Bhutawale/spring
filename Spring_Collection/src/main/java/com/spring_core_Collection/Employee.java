package com.spring_core_Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee
{
	private int eid;
	private String ename;
	private List<String> ephone;
	private Set<String> eaddress;
	private Map<String,String> ecourse;
	
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
	public List<String> getEphone() {
		return ephone;
	}
	public void setEphone(List<String> ephone) {
		this.ephone = ephone;
	}
	public Set<String> getEaddress() {
		return eaddress;
	}
	public void setEaddress(Set<String> eaddress) {
		this.eaddress = eaddress;
	}
	public Map<String, String> getEcourse() {
		return ecourse;
	}
	public void setEcourse(Map<String, String> ecourse) {
		this.ecourse = ecourse;
	}
	public Employee(int eid, String ename, List<String> ephone, Set<String> eaddress, Map<String, String> ecourse) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ephone = ephone;
		this.eaddress = eaddress;
		this.ecourse = ecourse;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ephone=" + ephone + ", eaddress=" + eaddress
				+ ", ecourse=" + ecourse + "]";
	}
	
	
}
