package com.Spring_ComponentAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("101")
	private int sid;
	@Value("Satish Bhutawale")
	private String sname;
	@Value("Karjat")
	private String saddress;
	@Value("#{contacts}")
	private List<String> scontact;
	
	public Student(int sid, String sname, String saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	
	
	public List<String> getScontact() {
		return scontact;
	}
	public void setScontact(List<String> scontact) {
		this.scontact = scontact;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + "]";
	}
	
	
}
