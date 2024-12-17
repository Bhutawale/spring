package com.Spring_Core_Autowired_Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student
{
	@Autowired
	@Qualifier(value="course1")  //@Qualifier identifies the particular bean on the config file to print the output.
	private Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student(Course course) {
		super();
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}
	
}
