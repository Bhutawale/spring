package com.spring_mvc_search_engine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController
{
	@RequestMapping("/home")
	public String SearchEngine()
	{
		System.out.println("This is Home Page");
		return "home";
	}
	
	@RequestMapping("/home1")
	public String home1()
	{
		return "home1";
	}
	
	@RequestMapping("/searchgoogle")
	public RedirectView SearchGoogle(@RequestParam("search") String search)
	{
		RedirectView view = new RedirectView();
			if(search.isBlank())
			{
			view.setUrl("/Spring_MVC_Search_Engine/home1");
			System.out.println("Please enter something to search");
		  	return view;
			}
			else
			{
			view.setUrl("https://www.google.com/search?q="+search);
			return view;
			}
	}
}
