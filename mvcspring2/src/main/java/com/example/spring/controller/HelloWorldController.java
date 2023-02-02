package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring.service.WelcomeService;

@Controller
@RequestMapping(value="/")
public class HelloWorldController {
	
@Autowired
WelcomeService welcomeService;
@RequestMapping(method=RequestMethod.GET)
public ModelAndView welcomeMsg()
{
	return new ModelAndView("welcome","msg","Hey Buddy !!!");
}
@RequestMapping(value="/first",method=RequestMethod.GET)
public ModelAndView firstwelcomeMsg()
{
	return new ModelAndView("welcome","msg",welcomeService.firstMsg());
}
@RequestMapping(value="/sec",method=RequestMethod.GET)
public ModelAndView secwelcomeMsg()
{
	return new ModelAndView("welcome","msg",welcomeService.secMsg());
}
}
