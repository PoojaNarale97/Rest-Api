package com.rest.restApi1.services;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.restApi1.entity.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	
	 List<Courses> list;
	 
	   public CourseServiceImpl() {
		   
		   list=new ArrayList<>();
		   list.add(new Courses(145,"java Corese","This course containse java code"));
		   list.add(new Courses(134,"React course","This is react Course"));
		
	}
 	
	
	 
	 
	@Override
	public List<Courses> getCources() {
		// TODO Auto-generated method stub
		return list;
	}




	@Override
	public Courses getCource(Long courseId) {
		
		Courses c=null;
		
		for(Courses cources:list)
		{
			if(cources.getId()==courseId)
			{
				c=cources;
				break;
			}
		}
		
		System.out.println(c);
		return c;
		
	}




	@Override
	public Courses addCourse(Courses courses) {
		
		list.add(courses);
		return courses;
	}
	
	

}
