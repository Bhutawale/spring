package com.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Redirect_Controller
{
	
	@RequestMapping("/first_url")
	public String one_url()
	{
		System.out.println("This is the First URL");
		
		return "redirect:/second_url";                    //redirecting using redirect.
	}
	
//	@RequestMapping("/second_url")                 
//	public String two_url()
//	{
//		System.out.println("This is the Second URL");
//		return "contact";
//	}
	
	@RequestMapping("/second_url")                //redirecting using RedirectView.
	public RedirectView two_url()
	{
		RedirectView redirectView = new RedirectView();
		//redirectView.setUrl("help");                        
		redirectView.setUrl("http://www.google.com");   //redirecting to google page url.
		return redirectView;
	}
	
}
