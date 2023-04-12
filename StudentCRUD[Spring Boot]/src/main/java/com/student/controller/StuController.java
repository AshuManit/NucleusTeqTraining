package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StuService;

@RestController
public class StuController {
	
	@Autowired
	private StuService stuService;
	
	@RequestMapping(method=RequestMethod.POST , value="/home")
	public void addStudent(@RequestBody Student student) {
		stuService.addStudent(student);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/home/{id}")
	public void update(@RequestBody Student student,@PathVariable Integer id) {
		stuService.updateStudent(student,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/home/{id}s")
	public void delete(Student student,@PathVariable Integer id) {
		stuService.deleteStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.GET , value="/home")
	public void getAllStudent(Student student) {
		stuService.getAllStudent();
	}
	
	@RequestMapping(method=RequestMethod.GET , value="/home/{id}")
	public void getStudentById(Student student,@PathVariable Integer id) {
		stuService.getStudentById(id);
	}
	
}
