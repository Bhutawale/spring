package com.spring_jdbc_insert_industry_standard;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_jdbc_insert_industry_standard.Entity.Employee;
import com.spring_jdbc_insert_industry_standard.dao.employeeDataI;

public class Test 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_jdbc_insert_industry_standard/config.xml");
		
		employeeDataI i = context.getBean("edi",employeeDataI.class);
		
		Employee emp=new Employee();
//	    Insert Data 
		
//		emp.setEid(778);
//		emp.setEname("Satish");
//		emp.setEcity("mumbai");
		
//		int insert = i.insert(emp);
//		System.out.println("Rows inserted in the database are "+ insert);
		
//		Update Data
		
//		emp.setEid(777);
//		emp.setEcity("Panvel");
//		emp.setEname("Sanskruti");
//		int update = i.update(emp);
//		System.out.println("Rows updated are "+update);
		
// 		Delete Data		
//		emp.setEid(778);
//		i.delete(emp);
//		System.out.println("Data Deleted Successfully");
		
		//Getting Single Employee Data using id
//		Employee emp_777 = i.getEmp(777);
//		System.out.println(emp_777);
		
		List<Employee> allEmployees = i.getAllEmployees();
		for(Employee e:allEmployees)
		{
			System.out.println(e);
		}
		
	}
}
