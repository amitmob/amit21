package com.example.rain.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "assignment")
public class Assignment {

	// ID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "assignment_id")
	private String assignmentId;

	// Course Name
	@Column(name = "course_name", length = 50, nullable = false)
	private String courseName;

	// Topic
	@Column(name = "topic", length = 120, nullable = false)
	private String topic;

	// Type
	@Column(name = "type", length = 20)
	private String type;

	// Current Date
	@Column(name = "current_date")
	private LocalDate currentDate;

	// Due Date
	@Column(name = "due_date")
	private LocalDate dueDate;

	// Marks
	@Column(name = "marks")
	private Integer marks;

	// Created Date
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date")
	private Date createdDate;

	public String getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(String assignmentId) {
		this.assignmentId = assignmentId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
