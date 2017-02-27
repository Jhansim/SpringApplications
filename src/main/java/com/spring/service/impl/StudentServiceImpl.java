package com.spring.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.spring.dao.StudentDao;
import com.spring.model.Student;
import com.spring.service.StudentService;



@Service
public class StudentServiceImpl implements StudentService {

	
	private	StudentDao studentDao;
	
	

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}



	public Student createStudent(Student  student) {
		return studentDao.createStudent(student);
	}
	/*
	public Student findByID(Long id) {
		
		return studentRepo.findOne(id);
	}


	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}

	public boolean deleteStudent(Student student) {
		boolean deleted;
		try{
		   studentRepo.delete(student);
		}catch(DataAccessException ex){
			deleted = false;
		}
	
	deleted = true;
	return deleted;
	}

	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

*/}
