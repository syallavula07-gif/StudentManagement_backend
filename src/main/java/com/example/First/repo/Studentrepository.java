package com.example.First.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.First.entity.Student;

@Repository
public interface Studentrepository extends CrudRepository<Student, Integer> {

}
