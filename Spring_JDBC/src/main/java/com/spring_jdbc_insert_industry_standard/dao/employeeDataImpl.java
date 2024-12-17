package com.spring_jdbc_insert_industry_standard.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring_jdbc_insert_industry_standard.Entity.Employee;

public class employeeDataImpl implements employeeDataI
{
	private JdbcTemplate jdbctemplate;
	
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}


	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}


	public int insert(Employee emp)
	{
		String query="insert into employee(eid,ename,ecity) values(?,?,?)";
		int row = jdbctemplate.update(query,emp.getEid(),emp.getEname(),emp.getEcity());
		return row;
	}


	public int update(Employee emp) {
		String query="update employee set ename=?,ecity=? where eid=?";
		int r = jdbctemplate.update(query,emp.getEname(),emp.getEcity(),emp.getEid());
		return r;
	}


	public void delete(Employee emp) {
		String query="delete from employee where eid=?";
		jdbctemplate.update(query,emp.getEid());
		
	}


	public Employee getEmp(int id) {
		String query="select * from employee where eid=?";
		RowMapperImpl rowmapper=new RowMapperImpl();
		Employee employee = jdbctemplate.queryForObject(query, rowmapper,id);
		return employee;
	}


	public List<Employee> getAllEmployees() {
		String query="select * from employee";
		RowMapperImpl rowmapper = new RowMapperImpl();
		List<Employee> emps = jdbctemplate.query(query, rowmapper);
		return emps;
	}


	
	
}

