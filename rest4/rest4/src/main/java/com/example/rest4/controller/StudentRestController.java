package com.example.rest4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.rest4.entity.Student;
import com.example.rest4.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentRestController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/get")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
	}

	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}

	@GetMapping("/get-by-name")
	public List<Student> getStudentByName(@RequestParam String name) {
		return studentService.getStudentByName(name);
	}
}
