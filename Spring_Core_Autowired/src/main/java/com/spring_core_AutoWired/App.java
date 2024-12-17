package com.spring_core_AutoWired;

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
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_core_AutoWired/config.xml");
        Employee e=(Employee) context.getBean("employee");
        System.out.println(e);
    }
}
