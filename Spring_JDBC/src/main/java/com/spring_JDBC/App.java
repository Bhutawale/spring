package com.spring_JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_JDBC/config.xml");
        JdbcTemplate template = context.getBean("jdbctemplate",JdbcTemplate.class);
        
        //insert query
        String query="insert into student(sid,sname,scity) values(?,?,?)";
        
        //fire query
        int q = template.update(query,003,"Sanskar Bhutawale","Karjat");
        
        System.out.println("Rows inserted in the tables "+ q);
    }
}
