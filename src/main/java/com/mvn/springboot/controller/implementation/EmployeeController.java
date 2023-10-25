package com.mvn.springboot.controller.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvn.springboot.model.Employee;
import com.mvn.springboot.service.EmployeeService;

@Component
@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/list")
	private List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@GetMapping("/get/{empid}")
	private Employee getEmployee(@PathVariable("empid") int empid) {
		return employeeService.getEmployeeById(empid);
	}

	@DeleteMapping("/delete/{empid}")
	private void deleteEmployee(@PathVariable("empid") int empid) {
		employeeService.delete(empid);
	}

	@PostMapping("/save")
	private int saveEmployee(@RequestBody Employee employee) {
		employeeService.saveOrUpdate(employee);
		return employee.getEmpid();
	}

	@PutMapping("/update")
	private Employee updateEmployee(@RequestBody Employee employee) {
		employeeService.saveOrUpdate(employee);
		return employee;
	}

}
/*
 * public String hi() { return "Hi"; }
 * 
 * public String get(int id, int age, String name, String location) { return
 * "Id: "+id+", Name: "+name+", Age: "+age+", Location: "+location; }
 * 
 * public String put(@RequestBody String name) { return
 * "Updated "+name+" information"; }
 * 
 * public String post(@RequestBody String name) { return "Hi "+name; }
 * 
 * public String delete(@RequestBody String name) { return
 * "Deleted "+name+"'s information"; } public String delete1() throws Exception{
 * throw new Exception("test"); }
 */
