package com.vinit.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinit.rest.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
