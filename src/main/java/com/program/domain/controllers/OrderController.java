package com.program.domain.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.program.domain.entities.Order;
import com.program.domain.repositories.OrderRepository;



@RestController              
@RequestMapping(value="/orders")
public class OrderController {
	
	@Autowired
	private OrderRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = repository.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = repository.findById(id).get();
		return ResponseEntity.ok().body(obj);
	}
	
}
