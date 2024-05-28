package com.first.crud.student.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.crud.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
