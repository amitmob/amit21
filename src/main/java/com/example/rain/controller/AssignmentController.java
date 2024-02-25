package com.example.rain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rain.entity.Assignment;
import com.example.rain.service.AssignmentService;

@RestController
@RequestMapping("/v1/ram")
public class AssignmentController {
	
	@Autowired
	AssignmentService assignmentService;
	
	// method to save assignment - create resource
	@PostMapping("/createassignment")
	public ResponseEntity<String> saveAssignment(@RequestBody Assignment assign) {
		String response = assignmentService.saveAssignment(assign);
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
		
	}

}
