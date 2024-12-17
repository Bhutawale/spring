package com.Spring_Autowired_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring_Autowired_Annotation/config.xml");
		context.getBean("course");
		Student stu=(Student)context.getBean("student");
		System.out.println(stu);
	}
}
