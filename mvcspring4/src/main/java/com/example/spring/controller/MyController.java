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
@RequestMapping(value = "/users")
public class MyController {
	
	 @RequestMapping(value = "/user/{username}/{age}",method = RequestMethod.GET)
	public ModelAndView getData(@PathVariable("username")String username, @PathVariable("age")int age,@RequestParam("gender") String gender)
	{
		return new ModelAndView("welcome","msg","hai, "+username+" "+age+"u r a "+gender+" gender");
	}
}
