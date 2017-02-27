package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.SchoolDao;
import com.spring.model.School;
import com.spring.service.SchoolService;




@Service
public class SchoolServiceImpl implements SchoolService {

	@Autowired
	private	SchoolDao schoolDao;
	


	@Override
	public School createSchool(School school) {
		
		return schoolDao.createSchool(school);
	}



	@Override
	public List<School> getSchoolList(int start, int max) {
        return schoolDao.getSchoolList(start, max);
	}



	


	}
