package com.Spring_Collection_Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person person=(Person)context.getBean("person_1");
		System.out.println(person.getPid());
		System.out.println(person.toString());
	}
}
