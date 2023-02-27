package com.example.Technosignia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Technosignia.dao.StudentRepository;
import com.example.Technosignia.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	public Student updateStudent(Student student,Long id) {
		Optional<Student> stCust=studentRepository.findById(id);
		Student stud=stCust.get();
		stud.setAddress(student.getAddress());
		stud.setContact(student.getContact());
		stud.setEmail(student.getEmail());

	return studentRepository.save(stud);
	
	}
	public String deleteStudent(Long id) {
			studentRepository.deleteById(id);
			return "Successfully deleted";
	}

}
