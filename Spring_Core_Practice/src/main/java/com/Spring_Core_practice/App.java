package com.Spring_Core_practice;

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
        Address add=(Address)context.getBean("address");
        Employee emp=(Employee)context.getBean("employee");
        System.out.println(emp);
        System.out.println(emp.getEaddress());
        System.out.println(add);
        
        System.out.println("---------------------");
        
        Address add_1=(Address)context.getBean("address_1");
        Employee emp_1=(Employee)context.getBean("employee_1");
        System.out.println(add_1);
        System.out.println(emp_1);
        
        System.out.println("---------------------");
        
        Address add_2=(Address)context.getBean("address_2");
        Employee emp_2=(Employee)context.getBean("employee_2");
        System.out.println(add_2);
        System.out.println(emp_2);
      
       
    }
}
