package com.pooja.exam.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET,path="/show")
	public String sayHello()
	{
		return "Hello Web";
	}
	
	/*public @ResponseBody Student getStudent()
	{
		Student student=new Student(11,"pooja",78.16);
		return student;
	}*/

}
