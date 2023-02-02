package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class HelloWorldController {
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView welcomeMsg() {
		return new ModelAndView("welcome","msg","Hey Buddy !!!");
	}
}
