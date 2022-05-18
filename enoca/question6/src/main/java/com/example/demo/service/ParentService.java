package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Parent;
import com.example.demo.entity.Student;
import com.example.demo.repository.ParentRepository;

@Service
public class ParentService implements IParentService {
	
	private final ParentRepository parentRepository;
	
	public ParentService(ParentRepository parentRepository) {
		
		this.parentRepository = parentRepository;
	}
	

	@Override
	public Parent createParent(Parent parent) {
		Parent result = parentRepository.save(parent);
		return result;
	}

	@Override
	public Optional<Parent> findParentById(Long id) {
		Optional<Parent> result = parentRepository.findById(id);
		return result;
		
	}

	@Override
	public Parent updateParent(Parent parent) {
		Parent result = parentRepository.save(parent);
		return result;
	}

	@Override
	public void deleteById(Long id) {
		parentRepository.deleteById(id);
		
	}


	@Override
	public List<Parent> findAllParents() {
		List<Parent> result= parentRepository.findAll();
		return result;
	}
	

}
