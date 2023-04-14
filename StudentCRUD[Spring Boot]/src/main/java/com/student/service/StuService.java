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

	public void updateStudent(Student student, String id) {
		// TODO Auto-generated method stub
		Optional<Student> stu=stuRepo.findById(id);
		
		if(stu.isPresent())
		{
			stuRepo.save(student);
		}else {
			System.out.println("Record not found you are looking for");
		}
		
	}

	public void deleteStudent(String id)  {
		// TODO Auto-generated method stub
		Optional<Student> stu=stuRepo.findById(id);
		if(stu.isPresent()) {
			stuRepo.deleteById(id);
		}else {
			System.out.println("Record not found for perform delete operation");
		}
		
	}

	public List<Student> getAllStudent() {
		List<Student> students=new ArrayList<Student>();
		stuRepo.findAll().forEach(student->students.add(student));
		return students;
	}

	public Optional<Student> getStudentById(String id) {
		// TODO Auto-generated method stub
		Optional<Student> stu=stuRepo.findById(id);
		return stu;
	}

	

}
