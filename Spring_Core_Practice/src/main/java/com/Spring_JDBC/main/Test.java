package com.Spring_JDBC.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring_JDBC.dao.PersonImpl;
import com.Spring_JDBC.entity.Person;


public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring_JDBC/main/config.xml");
		PersonImpl p=context.getBean("pimpl",PersonImpl.class);
		Person person=new Person();
		
		//Inserting data
		
		person.setPid(102);
		person.setPname("Suyog");
		person.setPcontact("9011150574");
		
		int insertPerson = p.insertPerson(person);
		System.out.println("Total Person Data inserted: "+insertPerson);
		
		//Updating Data
		
//		person.setPid(101);
//		person.setPname("Suyog Bhutawale");
//		person.setPcontact("7499151108");
//		
//		int updatePerson = p.updatePerson(person);
//		System.out.println("Total Person Updated: "+updatePerson);
		
		//Deleting Data
//		person.setPid(101);
//		p.deletePerson(person);
//		System.out.println("Data Deleted Successfully");
	}
}
