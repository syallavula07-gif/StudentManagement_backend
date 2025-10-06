package com.example.First.service;

//import java.util.List;

import com.example.First.entity.Student;

public interface Studentservice  {
	
	Student saveStudent(Student s);
	Student  getStudentById( Integer id);
	Student updateStudent(Integer id,Student newStudent);
	void deleteStudent(Integer id);
	Iterable<Student>getAllStudents();
	
	  
}

