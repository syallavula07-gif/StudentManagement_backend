	package com.example.First.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Student {
	@Id
	private int studentid;
	private String studentname;
	private String location;

	public Student(int studentid, String studentname, String location) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.location = location;
	}

	public Student() {
		super();
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
