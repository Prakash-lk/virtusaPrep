package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
@RequestMapping(value = "/domains/www.google.com")
public class MyController {
	
	 
		
	 @RequestMapping(value = "{domainName}",method = RequestMethod.GET)
	public ModelAndView getData(@PathVariable("domainName")String domainNname)
	{
		return new ModelAndView("welcome","msg","Domain name is: , "+domainNname);
	}
}
