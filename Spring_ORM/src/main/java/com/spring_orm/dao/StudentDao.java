package com.spring_orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring_orm.entities.Student;

public class StudentDao 
{
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	//inserting data
	
	@Transactional
	public int insert (Student stu)
	{
		Integer i=(Integer)hibernateTemplate.save(stu);
		return i;
		
	}
	
	//reading single data from the database.
	
	public Student getStudent(int id)
	{
		Student stu = hibernateTemplate.get(Student.class,id);
		return stu;	
	}
	
	//reading all the data from the database.
	
	public List<Student> getAllStudent()
	{
		List<Student> l1=hibernateTemplate.loadAll(Student.class);
		return l1;
	}
	
	//deleting the data from the database.
	
	@Transactional
	public void deleteStudent(int id)
	{
		Student s1 = hibernateTemplate.get(Student.class,id);
		hibernateTemplate.delete(s1);
	}
	
	//updating the data.
	@Transactional
	public void updateStudent(int id)
	{
		Student s2 = hibernateTemplate.get(Student.class,id);
		s2.setSname("Niranjan");
		s2.setSaddress("uk");
		hibernateTemplate.update(s2);
		
		
	}
} 

