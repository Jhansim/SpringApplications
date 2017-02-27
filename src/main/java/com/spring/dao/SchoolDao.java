package com.spring.dao;

import java.util.List;

import com.spring.model.School;

public interface SchoolDao  {
	
	public School createSchool(School school);
	public List<School> getSchoolList(int start,int max);

}
