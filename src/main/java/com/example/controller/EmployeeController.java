package com.example.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Employee;
import com.example.beans.service.EmployeeService;

@RestController
public class EmployeeController {
	
	EmployeeService employeeservice;
	@CrossOrigin	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeDetails(@PathVariable(name="id")long id) {
	
		return new EmployeeService().getEmployee(id);
	}

}
