package com.spring_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring_mvc.model.User;
import com.spring_mvc.service.UserService;

@Controller
public class ContactController
{
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/contact")
	public String ShowForm()
	{
		System.out.println("This is contact page");
		return "contact";
	}
	
	
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String ProcessForm(@RequestParam("email") String userEmail,
//								@RequestParam("username") String userName,
//								@RequestParam("password") String userPassword,
//								Model model)
//	{
////		System.out.println(userEmail);
//		System.out.println(userName);
//		System.out.println(userPassword);
//			
//		
//		model.addAttribute("email", userEmail);
//		model.addAttribute("name",userName);
//		model.addAttribute("password",userPassword);
//	
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String ProcessForm(@ModelAttribute("user") User user,Model model)
	{
		if(user.getUserName().isBlank() || user.getEmail().isBlank()  || user.getPassword().isBlank())
		{
			return "redirect:/contact";
		}
		System.out.println(user);
		
		userService.createUser(user);
		
		model.addAttribute("msg","User Created and added to database Successfully");
		
		return "success";
	}
	
	
}
