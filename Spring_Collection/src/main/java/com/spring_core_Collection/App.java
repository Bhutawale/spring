package com.spring_core_Collection;

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
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Employee emp=(Employee) context.getBean("employee1");
        System.out.println(emp.getEid());
        System.out.println(emp.getEname());
        System.out.println(emp.getEphone());
        System.out.println(emp.getEaddress());
        System.out.println(emp.getEcourse());
        
    }
}
