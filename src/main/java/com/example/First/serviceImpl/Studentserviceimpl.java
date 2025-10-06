package com.example.First.serviceImpl;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.First.entity.Student;
import com.example.First.repo.Studentrepository;
import com.example.First.service.Studentservice;

@Service
public class Studentserviceimpl implements Studentservice {
	@Autowired
	private Studentrepository repo;

	@Override
	public Student saveStudent(Student s) {

		return repo.save(s);
	}
	

	@Override
	public Student getStudentById(Integer id) {
		
		return repo.findById(id).orElse(null);
	}


	/*
	 * @Override public Student updateStudent(Integer id, Student newStudent) {
	 * Student dbStudent=getStudentById(id); if (dbStudent == null) return null;
	 * dbStudent.setStudentname(newStudent.getStudentname()); return
	 * repo.save(newStudent); }
	 */
	@Override
	public Student updateStudent(Integer id, Student newStudent) {
	    Student dbStudent = getStudentById(id);
	    if (dbStudent == null) return null;
	    dbStudent.setStudentname(newStudent.getStudentname());
	   

	    return repo.save(dbStudent); 
	}


	@Override
	public void deleteStudent(Integer id) {
		
		repo.deleteById(id);
	}


	@Override
	public Iterable<Student> getAllStudents() {
		
		return repo.findAll();
	}



}
