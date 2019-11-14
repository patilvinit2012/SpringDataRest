package com.vinit.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinit.rest.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
