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
import com.example.demo.service.IParentService;

@RestController
@RequestMapping("/parent")

public class ParentController {
	private final IParentService parentService;
	
	public ParentController(IParentService parentService) {
		this.parentService = parentService;
		
	}
	@PostMapping
	public Parent createParent(Parent parent) {
		Parent result = parentService.createParent(parent);
		return result;
		
	}
	
	@GetMapping("/{id}")
	public Optional<Parent> findById(@PathVariable Long id) {
		return parentService.findParentById(id);
	}
	
	@GetMapping("/findAllParents")
	public List<Parent> findAllParents() {
		return parentService.findAllParents();
	}
	
	@PutMapping("/updateParent")
	public Parent updateById(@PathVariable Parent parent ){
		return parentService.updateParent(parent);
	}
	
	@DeleteMapping("/deleteParent")
	public void deleteById(@PathVariable Long id) {
		parentService.deleteById(id);
	}
	
	
	

}
