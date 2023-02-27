package com.example.Technosignia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Technosignia.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	

}
