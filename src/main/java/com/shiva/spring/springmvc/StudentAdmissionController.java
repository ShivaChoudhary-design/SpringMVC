package com.shiva.spring.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shiva.spring.springmvc.dto.Student;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}

	// we can put map in request Param and get the value by get method to avoid
	// writing too many RequestParam
	// @RequestParam(value = "studentName") String name,
	// @RequestParam("studentHobby") String hobby
	//@RequestParam Map<String,String> reqPar

	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm( @ModelAttribute("student1") Student student1) {
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		// model.addObject("msg", "Details submitted by you : Name:" + name + " Hobby: "
		// + hobby);
		return model;
	}

}
