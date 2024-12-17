package com.spring_jdbc_insert_industry_standard.dao;

import java.util.List;

import com.spring_jdbc_insert_industry_standard.Entity.Employee;

public interface employeeDataI 
{
	public int insert(Employee emp);
	
	public  int update(Employee emp);
	
	public void delete(Employee emp);
	
	public Employee getEmp(int id);
	
	public List<Employee> getAllEmployees();

}
