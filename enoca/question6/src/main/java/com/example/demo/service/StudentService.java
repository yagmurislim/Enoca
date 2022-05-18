package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Parent;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService implements IStudentService {
	private final StudentRepository studentRepository;
	

	public StudentService(StudentRepository studentRepository) {
	
		this.studentRepository = studentRepository;
	}
	

	@Override
	public Student addStudent(Student student) {
		Student result = studentRepository.save(student);
		return result;
	}

	@Override
	public Optional<Student> findStudentById(Long id) {
		Optional<Student> result = studentRepository.findById(id);
		return result;
	}

	@Override
	public Student updateStudent(Student student) {
		Student result = studentRepository.save(student);
		return result;
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}


	@Override
	public List<Student> findAllStudents() {
		List<Student> result = studentRepository.findAll();
		return result;
	}

}
