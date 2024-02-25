package com.example.rain.service;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rain.entity.Assignment;
import com.example.rain.repository.AssignmentRepository;

@Service
public class AssignmentService {
	
	@Autowired
	AssignmentRepository assignmentRepository;
	
	// Method to save assignment 
	public String saveAssignment(Assignment assign) {
		String msg = "";
		System.out.println("Saving Assignment...");
		Assignment assignment = new Assignment();
		assignment.setCourseName(assign.getCourseName());
		assignment.setTopic(assign.getTopic());
		// Get type and save
		String type = assign.getType();
		if(type.equals("M")) {
			assignment.setType("mcq");
		} else if(type.equals("S")) {
			assignment.setType("short questions");
		} else if(type.equals("P")) {
			assignment.setType("programming");
		} else if(type.equals("R")) {
			assignment.setType("research");
		} else {
			assignment.setType("Invalid Type");
		}
		LocalDate currDate  = assign.getCurrentDate();
		LocalDate dueDate = assign.getDueDate();
	  // Check whether current date is greater than due date
		if(currDate.getDayOfMonth() > dueDate.getDayOfMonth()) { 
			msg = "Current date should not greater than due date. Please enter the valid current date";
			return msg;
		} else {
			  // Current Date - as of present date	
			  LocalDate currentDt = LocalDate.now();
			  assignment.setCurrentDate(currentDt);
			  // Due Date
			  String[] date = assign.getDueDate().toString().split("-");
			  int dt = Integer.parseInt(date[0]);
			  int mon = Integer.parseInt(date[1]);
			  int yr = Integer.parseInt(date[2]);
			  LocalDate dueDt = LocalDate.of(yr, mon, dt);
			  assignment.setDueDate(dueDt);
		}
		assignment.setMarks(assign.getMarks());
		assignment.setCreatedDate(new Date());
		assignmentRepository.save(assignment);
		msg = "Assignment Succeefully Saved...!!!";
		return msg;
	}

}
