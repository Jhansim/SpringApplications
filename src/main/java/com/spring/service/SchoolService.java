package com.spring.service;



import java.util.List;

import com.spring.model.School;






public interface SchoolService {
	
	//public Student findByID(Long id);
	public School createSchool(School school);
//	public Student updateStudent(Student student);
	//public boolean deleteStudent(Student student);
	public List<School> getSchoolList(int start,int max);
	

}
