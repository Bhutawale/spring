package com.spring_core_constructor;

public class Certificate
{
	private String course;

	public Certificate(String course) {
		super();
		this.course = course;
	}

	@Override
	public String toString() {
		return "Certificate [course=" + course + "]";
	}	
	
}
