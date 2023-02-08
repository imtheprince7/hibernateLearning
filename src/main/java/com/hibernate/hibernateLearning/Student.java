package com.hibernate.hibernateLearning;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name= "Student_details")
public class Student {
	@GeneratedValue
	private int id;
	private int rollNo;
	private String name;
	private String course;
	private int duration;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public Student(int id, int rollNo, String name, String course, int duration) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", duration="
				+ duration + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}	

}
