package com.annotation.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("1")
	private int id;
	@Value("Satish Bhutawale")
	private String name;
	@Value("Spring")
	private String Course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Course=" + Course + "]";
	}
	
	
}
