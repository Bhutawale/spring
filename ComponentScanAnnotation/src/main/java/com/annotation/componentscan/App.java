package com.annotation.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		ApplicationContext context=
			new AnnotationConfigApplicationContext(AppConfig.class);
        Student stu = context.getBean("student",Student.class);
        System.out.println(stu.toString());
    }
}
