package com.example.Technosignia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Technosignia.entity.Student;
import com.example.Technosignia.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student,@RequestParam Long id) {
		return studentService.updateStudent(student,id);
	}
	@DeleteMapping("/student")
	public String deleteStudentById(Long id) {
		return studentService.deleteStudent(id);
	}
	

}
