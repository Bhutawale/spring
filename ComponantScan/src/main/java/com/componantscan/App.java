package com.componantscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        @SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("componantscan.xml");
        Employee emp = context.getBean("employee",Employee.class);
        
        System.out.println(emp.toString());
    }
}
