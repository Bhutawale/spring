package com.spring_core_constructor_ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_core_constructor_ambiguity/config.xml");
		Addition add=(Addition) context.getBean("add");
		
		add.add();	
	}
}

//By default spring will take the values as string, and it will call String type Constructor.
//To avoid this ambiguity we need to specify "type" and "index" attribute in the xml file to identify the correct constructor.
//type will identify the data type of value and index will notify which value has to be taken as first argument and second argument.