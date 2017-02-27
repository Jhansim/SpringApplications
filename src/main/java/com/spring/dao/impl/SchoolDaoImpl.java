package com.spring.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import org.springframework.stereotype.Repository;

import com.spring.dao.SchoolDao;
import com.spring.model.School;

@SuppressWarnings("deprecation")
@Repository
public class SchoolDaoImpl implements SchoolDao {
	
	private static SessionFactory sessionFactory; 
	  private static ServiceRegistry serviceRegistry;
	static{
		Configuration configuration = new Configuration();
        configuration.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();        
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}
	@Override
	public School createSchool(School school) {
		School saved=null;
		Session hs = sessionFactory.openSession();
		try{
		
		hs.beginTransaction();
		hs.saveOrUpdate(school);
		hs.getTransaction().commit();
		hs.close();
		}catch(HibernateException hex){
			hex.printStackTrace();
			hs.getTransaction().rollback();
		}
		return saved;
		

	}
	@Override
	public List<School> getSchoolList(int start, int max) {
		Session hs = sessionFactory.openSession();
		List<School> schoolList=null;
		try{
		hs.beginTransaction();
		Query qry =  hs.createQuery("From School");
		qry.setFirstResult(2);
		qry.setMaxResults(2);
		schoolList = qry.list();
		
		hs.getTransaction().commit();
		hs.close();
		}catch(HibernateException hex){
			hex.printStackTrace();
			hs.getTransaction().rollback();
		}
		return schoolList;
	}

}
