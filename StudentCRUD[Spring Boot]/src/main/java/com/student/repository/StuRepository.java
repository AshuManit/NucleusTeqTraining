package com.student.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.student.model.Student;



public interface StuRepository extends CrudRepository<Student,String> {

	
	
}
