package com.spring.RestServices;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.model.School;
import com.spring.service.SchoolService;


@Path("JerseySchoolService")
public class JerseySchoolService {
	/**
     * Default constructor. 
     */
    public JerseySchoolService() {
        // TODO Auto-generated constructor stub
    }

    @Autowired
    SchoolService schoolService;

    /**
     * Retrieves representation of an instance of JerseySchoolService
     * @return an instance of String
     */
	@GET
	@Path("/schools")
	@Produces("application/json")
	public List<School> resourceMethodGET() { 
		return schoolService.getSchoolList(2,6);
	}

	/**
     * PUT method for updating or creating an instance of JerseySchoolService
     * @content content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
	@PUT
	@Path("/school/{schoolId}")
	@Consumes({"text/plain", "application/json" })
	@Produces("application/json")
	public void resourceMethodPUT(School school) { 
		schoolService.createSchool(school);
		
	}
}