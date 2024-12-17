package com.spring_core_reference;

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
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_core_reference/config.xml");
        A a1=(A) context.getBean("A_reference"); 
        System.out.println(a1);
        System.out.println("x = "+a1.getX());
        System.out.println("y = "+a1.getOb().getY());
    }
}
