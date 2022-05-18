package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Parent;
import com.example.demo.entity.Student;

public interface IStudentService {

	Student addStudent(Student student);

	Optional<Student> findStudentById(Long id);

	Student updateStudent(Student student);

	void deleteStudentById(Long id);

	List<Student> findAllStudents();

}
