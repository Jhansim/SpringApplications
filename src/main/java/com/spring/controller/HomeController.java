package com.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.School;
import com.spring.model.Student;
import com.spring.service.SchoolService;
import com.spring.service.StudentService;

@Controller
public class HomeController {
	@Autowired
	private SchoolService schoolService;
	

	
	@RequestMapping("/inHome")
	public  ModelAndView startUp(){
		System.out.println("at home");
		ModelAndView mv = new ModelAndView("SchoolDetails");
		return mv;
	}
	@RequestMapping("/create")
	public @ResponseBody School createStudent(){
		School school = new School();
	//	school.setId(new Long(4));
		school.setName("little buds");
		school.setRegistrationnumber("Ap26");
		school = schoolService.createSchool(school);
		return school;
	}
	@RequestMapping("/fetchSchools")
	public @ResponseBody List<School> fetchSchoolList(){
		System.out.println("in fetchSchools");
		List<School> list =  schoolService.getSchoolList(0, 2);
		return list;
	}

}
