package com.Spring_JDBC.dao;


import org.springframework.jdbc.core.JdbcTemplate;

import com.Spring_JDBC.entity.Person;


public class PersonImpl implements PersonI
{
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertPerson(Person per) {
		String query="insert into person (pid,pname,pcontact) values(?,?,?)";
		int insert = jdbcTemplate.update(query, per.getPid(),per.getPname(),per.getPcontact());
		return insert;
	}

	public int updatePerson(Person per) {
		String query="update person set pname=?,pcontact=? where pid=?";
		int update = jdbcTemplate.update(query,per.getPname(),per.getPcontact(),per.getPid());
		return update;
	}

	public void deletePerson(Person per) {
		
		String query="delete from person where pid=?";
		jdbcTemplate.update(query,per.getPid());
		
	}

	
	
	
}
