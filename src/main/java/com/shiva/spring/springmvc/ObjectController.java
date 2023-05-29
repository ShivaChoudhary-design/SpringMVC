package com.shiva.spring.springmvc;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shiva.spring.springmvc.dto.Employee;
@Controller
public class ObjectController {
	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		Employee employee = new Employee();
		employee.setId(124);
		employee.setName("John");
		employee.setSalary(8000);
		
		List<Employee> emp = new java.util.ArrayList<>();
		modelAndView.addObject("employee", employee);
		
		return modelAndView;
	}

}
