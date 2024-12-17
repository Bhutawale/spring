package com.spring_orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_orm.dao.StudentDao;
import com.spring_orm.entities.Student;

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
       //inserting data
        StudentDao sd = context.getBean("studentDao",StudentDao.class);
//        Student stu=new Student(116,"Babu genu","New Delhi");
//        sd.insert(stu);
//        System.out.println("Data Inserted");
      
        //getting single data
        Student s1 = sd.getStudent(116);
        System.out.println(s1);
        
//        //getting all data
//        List<Student> allStudent = sd.getAllStudent();
//        System.out.println(allStudent);
//        for(Student s:allStudent)
//        {
//        	System.out.println(s);
//        }
//       
//        //deleting the single data.
//        
//        sd.deleteStudent(113);
//        System.out.println("Data Deleted");
//        
//        //updating the data. 
//        sd.updateStudent(114);
//       
//        System.out.println("Data Updated");
    }
}
