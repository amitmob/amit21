package com.example.rain.entity;

import java.io.Serializable;

import javax.persistence.*;

@IdClass(EmployeeID.class)
@Entity
@Table(name="employee")
public class Employee implements Serializable {
	
	// composite primary key i.e multiple primary key - ID & Name
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empid")
	private Long empId;
	
	@Id
	@Column(name="empname")
	private String empName;
	
	@Column(name="empDept")
	private String empDept;
	
	@Column(name="salary")
	private int salary;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
