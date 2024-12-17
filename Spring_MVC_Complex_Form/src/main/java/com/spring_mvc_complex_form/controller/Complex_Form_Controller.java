package com.spring_mvc_complex_form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Complex_Form_Controller
{
	@RequestMapping("/form")
	public String form()
	{
		System.out.println("Showing Form");
		return "complex_form";
	}
	
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("Person")Person person)
	{
		System.out.println(person);
		return "success";
	}
} 
