package com.example.First.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.First.entity.Teacher;

@Repository
public interface Teacherrepository extends JpaRepository<Teacher, Integer> {

}
