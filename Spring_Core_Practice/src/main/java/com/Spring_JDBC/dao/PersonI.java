package com.Spring_JDBC.dao;

import java.util.List;

import com.Spring_JDBC.entity.Person;


public interface PersonI 
{
	public int insertPerson(Person per);
	
	public int updatePerson(Person per);
	
	public void deletePerson(Person per);
	
	
	
}
