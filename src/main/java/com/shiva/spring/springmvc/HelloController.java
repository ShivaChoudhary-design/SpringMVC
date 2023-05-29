package com.shiva.spring.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("differentHello","hello");
		
		return modelAndView;
	}
	
	@RequestMapping("/hello/{userName}/{countryName}")
	public ModelAndView helloName(@PathVariable("userName") String userName)
	{
		ModelAndView model = new ModelAndView("hello");
		model.addObject("msg","hello " +userName);
		return model;
		
		
	}
}
