package com.example.First.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {
        @Id
	private int teacherId;
	private String teacherName;

	private String teacherLocation;

}
