package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Parent;

public interface IParentService {

	Parent createParent(Parent parent);

	Parent updateParent(Parent parent);

	void deleteById(Long id);

	Optional<Parent> findParentById(Long id);

	List<Parent> findAllParents();

	

}
