package com.Spring_RemovingXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(Config.class);
		Person person=context.getBean("person", Person.class);
		System.out.println(person);
		context.close();
	}
}
