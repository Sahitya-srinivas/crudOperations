package com.mvn.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.mvn.springboot.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
