package com.student.repository;

import org.springframework.data.repository.CrudRepository;

import com.student.model.Student;



public interface StuRepository extends CrudRepository<Student,Integer> {
	
}
