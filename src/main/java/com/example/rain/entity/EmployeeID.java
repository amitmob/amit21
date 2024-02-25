package com.example.rain.entity;

import java.io.Serializable;

public class EmployeeID implements Serializable {
	
	private Long empId;
	private String empName;
	
	// No arg constructor
	public EmployeeID () {
		
	}
	
	// Parameterized constrtcuor
	public EmployeeID (Long empid, String empname) {
		this.empId=empId;
		this.empName=empName;
		
	}

}
