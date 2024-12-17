package com.spring_mvc_complex_form.controller;

import java.util.Date;
import java.util.List;

public class Person 
{
	private String name;
	private Long id;
	private Date dob;
	private List<String> course;
	private String gender;
	private String type;
	
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", dob=" + dob + ", course=" + course + ", gender=" + gender
				+ ", type=" + type + ", address=" + address + "]";
	}

	public Person(String name, Long id, Date dob, List<String> course, String gender, String type, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.course = course;
		this.gender = gender;
		this.type = type;
		this.address = address;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
