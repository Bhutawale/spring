package com.Spring_Core_Autowired_Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring_Core_Autowired_Qualifier/config.xml");
		Student s=(Student)context.getBean("student");
		System.out.println(s);
	}
}
