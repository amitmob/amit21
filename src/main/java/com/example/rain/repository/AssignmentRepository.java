package com.example.rain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rain.entity.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment,Integer> {
	

}
