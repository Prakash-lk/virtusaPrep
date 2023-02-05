package com.example.spring.controller;

import java.util.Map;

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
	
	 
	@RequestMapping(value = "{userName}/{age}",method = RequestMethod.GET)
	public ModelAndView getData(@PathVariable Map<String,String> pathMaps,@RequestParam String gender)
	{//@PathVariable("userName")String userNname,@PathVariable("age")String age
		 String userName=pathMaps.get("userName");
		int age=Integer.parseInt(pathMaps.get("age"));
		return new ModelAndView("welcome","msg","details: "+userName+" "+age+" "+gender);
	}
}
