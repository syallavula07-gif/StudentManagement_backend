package com.example.First.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.First.entity.Student;
import com.example.First.service.Studentservice;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Studentcontroller {
	
	@Autowired
	private Studentservice service;

	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		Student saved = service.saveStudent(student);
		return new ResponseEntity<>(saved, HttpStatus.CREATED);

	}
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Integer id) {
		Student get = service.getStudentById(id);
		return new ResponseEntity<>(get, HttpStatus.OK);

	}

	
	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Integer id,
	                                             @RequestBody Student newStudent) {
	    Student updated = service.updateStudent(id, newStudent);

	    if (updated == null) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	    return new ResponseEntity<>(updated, HttpStatus.OK);
	}

	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable int id){
		service.deleteStudent(id);
        
	}
	@GetMapping("/getall")
	public ResponseEntity<Iterable<Student>> getAllStudents() {
		Iterable<Student> getAll=service.getAllStudents();
		return new ResponseEntity<>(getAll,HttpStatus.OK);
		
	}
	

}
