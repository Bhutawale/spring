package com.Spring_Collection_Practice;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person 
{
	private int pid;
	private String pname;
	private List<String> pcontact;
	private Set<String> pcity;
	private Map<String, String> paddress;
	public Person(int pid, String pname, List<String> pcontact, Set<String> pcity, Map<String, String> paddress) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcontact = pcontact;
		this.pcity = pcity;
		this.paddress = paddress;
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
	public List<String> getPcontact() {
		return pcontact;
	}
	public void setPcontact(List<String> pcontact) {
		this.pcontact = pcontact;
	}
	public Set<String> getPcity() {
		return pcity;
	}
	public void setPcity(Set<String> pcity) {
		this.pcity = pcity;
	}
	public Map<String, String> getPaddress() {
		return paddress;
	}
	public void setPaddress(Map<String, String> paddress) {
		this.paddress = paddress;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pcontact=" + pcontact + ", pcity=" + pcity + ", paddress="
				+ paddress + "]";
	}
	
	
}
