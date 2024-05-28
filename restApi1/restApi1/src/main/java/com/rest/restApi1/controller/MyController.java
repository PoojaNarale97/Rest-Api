package com.rest.restApi1.controller;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.rest.restApi1.entity.Courses;
import com.rest.restApi1.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	 private CourseService service;
	 
	 @GetMapping("/home")
	public String home()
	{
		return "This is Home page";
	}
	
	
	//get the Cources
	    @GetMapping("/courses")
		public List<Courses> getCourses()
		{
			return this.service.getCources();
		}
	    
	    @GetMapping("/courses/{courseId}")
		public Courses getCourse(@PathVariable String courseId)
		{
			return this.service.getCource(Long.parseLong(courseId));
		}
	    
	    @PostMapping(path="/courses")
	    public Courses addCourse(@RequestBody Courses courses)
	    {
	    	return this.service.addCourse(courses);
	    }
	    



}
