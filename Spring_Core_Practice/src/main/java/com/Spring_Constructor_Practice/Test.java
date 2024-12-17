package com.Spring_Constructor_Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Course course=(Course)context.getBean("course");
		Student student=(Student)context.getBean("stu");
		
		System.out.println(student);
		
		
	}
}
