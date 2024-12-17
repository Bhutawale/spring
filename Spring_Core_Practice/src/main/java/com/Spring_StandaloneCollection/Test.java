package com.Spring_StandaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring_StandaloneCollection/config.xml");
		Person person=context.getBean("person", Person.class);
		System.out.println(person);
		System.out.println(person.getAddress().getClass().getName());
		System.out.println(person.getContact().getClass().getName());
		System.out.println(person.getCourse().getClass().getName());
	}
}
