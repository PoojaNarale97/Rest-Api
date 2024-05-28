package com.first.crud.student.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.crud.student.entity.Student;
import com.first.crud.student.repos.StudentRepository;

@RestController
@RequestMapping("/api")

public class StudentRestController {
	
	@Autowired
	private StudentRepository repos;
	
	@GetMapping("/all")
	public List<Student> getAllStudent()
	{
		return repos.findAll();
	}
	

}
