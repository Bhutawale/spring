package com.spring_mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController 
{
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name","Satish Bhutawale");
		System.out.println("This is Home URL");
		
		
		List<String> friends=new ArrayList<String>();
		friends.add("Sarang");
		friends.add("Ruchi");
		friends.add("Nirangan");
		friends.add("Sampat");
		
		model.addAttribute("f",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is About URL");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is Help Page");
		
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("name", "Satish Bhutawale");
		mv.addObject("city","Karjat");
		
		mv.setViewName("help");
		
		LocalDateTime now = LocalDateTime.now();
		mv.addObject("time",now);
		
		return mv;
	
	}
}
