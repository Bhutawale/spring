package com.spring_core_SPEL;

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
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_core_SPEL/config.xml");
        Employee emp=context.getBean("employee",Employee.class);
        System.out.println(emp);
        
    }
}
