package com.spring_core_AutoWired_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_core_AutoWired_Annotation/config.xml");
		Employee e=(Employee) context.getBean("employee");
		System.out.println(e);
	}
}
