package com.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repository.StuRepository;


@Service
public class StuService {
	
	@Autowired
	private StuRepository stuRepo;
	
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		stuRepo.save(student);
	}

	public void updateStudent(Student student, Integer id) {
		// TODO Auto-generated method stub
		stuRepo.save(student);
	}

	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		stuRepo.deleteById(id);
		}

	public List<Student> getAllStudent() {
		List<Student> listOfStudent=new ArrayList<Student>();
		stuRepo.findAll().forEach(student->listOfStudent.add(student));
		return listOfStudent;
	}

	public Optional<Student> getStudentById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Student> stu=stuRepo.findById(id);
		return stu;
	}

	

}
