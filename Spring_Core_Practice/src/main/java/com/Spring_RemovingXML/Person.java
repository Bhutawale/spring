package com.Spring_RemovingXML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person
{
	@Value("Satish Bhutawale")
	private String pname;
	
	@Value("9011150573")
	private String pphone;
	
	public Person(String pname, String pphone) {
		super();
		this.pname = pname;
		this.pphone = pphone;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPphone() {
		return pphone;
	}
	public void setPphone(String pphone) {
		this.pphone = pphone;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pphone=" + pphone + "]";
	}
	
}
