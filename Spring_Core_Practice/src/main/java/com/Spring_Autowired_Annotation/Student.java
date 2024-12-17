package com.Spring_Autowired_Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
	private String name;
	@Autowired
	private Course course;
	public Student(String name, Course course) {
		super();
		this.name = name;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	
	
}
