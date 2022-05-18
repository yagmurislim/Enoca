package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Parent;
import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;

@RestController
@RequestMapping("/student")

public class StudentController {
	private final IStudentService studentService;
	
	public StudentController(IStudentService studentService) {
		this.studentService = studentService;
		
	}
	
	@PostMapping
	public Student addStudent(Student student) {
		return studentService.addStudent(student);
				
	}
	@GetMapping("/findStudent/{id}")
	public Optional<Student> findById(@PathVariable Long id) {
		return studentService.findStudentById(id);
	}
	
	@GetMapping("/findAllStudents")
	public List<Student> findAllStudents() {
		return studentService.findAllStudents();
	}
	
	@PutMapping("/updateStudent")
	public Student updateById(Student student){
		return studentService.updateStudent(student);
	}
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteById(@PathVariable Long id) {
		studentService.deleteStudentById(id);
	}
	

}
