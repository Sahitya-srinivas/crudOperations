package com.mvn.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvn.springboot.model.Employee;
import com.mvn.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	static List<Employee> employee = new ArrayList<Employee>();

	public List<Employee> getAllEmployee() {
		return (List<Employee>) employeeRepository.findAll();
	}

	public Employee getEmployeeById(int empid) {
		return employeeRepository.findById(empid).get();
	}

	public void saveOrUpdate(Employee employee) {
		employeeRepository.save(employee);
	}

	public void delete(int empid) {
		employeeRepository.deleteById(empid);
	}

	public void update(Employee employee, int empid) {
		employeeRepository.save(employee);
	}
}
