package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.InputJson;
import com.spring.model.School;
import com.spring.service.SchoolService;

@RestController
@RequestMapping("/SchoolService")
public class RestfulController {
	
	@Autowired
	SchoolService schoolService; 
	
	@RequestMapping(value="/Schools",method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<School> getSchools(@RequestBody InputJson input){
		return schoolService.getSchoolList(input.getStartIndex(), input.getEndIndex());
	
		
	}

}
