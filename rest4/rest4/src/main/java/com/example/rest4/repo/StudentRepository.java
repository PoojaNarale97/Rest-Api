package com.example.rest4.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.rest4.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

//	@Query("select s from Student s where s.name=:name ") //this is an plane JPQL Query 
//	@Query(value = "SELECT * FROM stud4 WHERE name = :name", nativeQuery = true) //this is an plane SQl Query 
//	public List<Student> getStudentByName(@Param("name") String name);
	public List<Student> getStudentByName(String name); // custome Query JPQL

}
