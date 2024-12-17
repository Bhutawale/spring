package com.spring_core_01;

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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee employee=(Employee)context.getBean("emp");
        Employee employee1=(Employee)context.getBean("emp1");
        System.out.println(employee);
        System.out.println(employee1);
    }
}
