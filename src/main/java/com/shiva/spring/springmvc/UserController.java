package com.shiva.spring.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shiva.spring.springmvc.dto.User;

@Controller
public class UserController {
	@RequestMapping("/register")
	public ModelAndView showRegistrationPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("userReg");
		return model;

	}
	
	@RequestMapping(value = "registerUser",method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user")User user) {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("userRegistration");
		return model;

	}


}
