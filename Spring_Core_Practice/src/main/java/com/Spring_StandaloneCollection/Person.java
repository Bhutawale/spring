package com.Spring_StandaloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person 
{
	private String name;
	private List<String> contact;
	private Set<String> course;
	private Map<String,String> address;
	
	public Person(String name, List<String> contact, Set<String> course, Map<String, String> address) {
		super();
		this.name = name;
		this.contact = contact;
		this.course = course;
		this.address = address;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getContact() {
		return contact;
	}
	public void setContact(List<String> contact) {
		this.contact = contact;
	}
	public Set<String> getCourse() {
		return course;
	}
	public void setCourse(Set<String> course) {
		this.course = course;
	}
	public Map<String, String> getAddress() {
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", contact=" + contact + ", course=" + course + ", address=" + address + "]";
	}
	
	
}
