package com.rest.restApi1.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.rest.restApi1.entity.Courses;

public interface CourseService {
	
	public List<Courses> getCources();
	public Courses getCource(Long courseId);
	 public Courses addCourse(Courses courses);
	    

}
