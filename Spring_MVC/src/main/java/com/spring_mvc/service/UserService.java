package com.spring_mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_mvc.dao.UserDao;
import com.spring_mvc.model.User;

@Service
public class UserService 
{
	@Autowired
	private UserDao userdao;
	
	public int createUser(User user)
	{
		return userdao.saveUser(user);
		
	}
}
