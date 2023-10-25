//package com.mvn.springboot.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.mvn.springboot.model.Employee;
//import com.mvn.springboot.service.EmployeeService;
//
//@RestController
//@RequestMapping("/emp")
//public interface EmployeeControllerInterface {
//
//	@Autowired
//	EmployeeService employeeService;  
//
//
//	@GetMapping("/get/{empid}")  
//	private Employee getEmployee(@PathVariable("empid") int empid); 
//
//
//	@DeleteMapping("/delete/{empid}")  
//	private void deleteEmployee(@PathVariable("empid") int empid); 
//
//	@PostMapping("/save")  
//	private int saveEmployee(@RequestBody Employee employee);
//
//	@PutMapping("/update")  
//	private Employee update(@RequestBody Employee employee);
//}
	
	
	/*
	@GetMapping("/hi")
	public String hi();

	@GetMapping("/get/{id}/{age}")
	public String get(@PathVariable("id") int id, @PathVariable("age") int age,
			@RequestParam(name = "name") String name,
			@RequestParam(name = "location", defaultValue = "Banglore") String location);

	@PostMapping("/add")
	public String post(@RequestBody String name);		

	@PutMapping("/put")
	public String put(@RequestBody String name);
	
	@DeleteMapping("/delete")
	public String delete(@RequestBody String name);
	
	@DeleteMapping("/delete1")
	public String delete1() throws Exception;
}*/