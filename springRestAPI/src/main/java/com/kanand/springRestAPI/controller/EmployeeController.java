package com.kanand.springRestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kanand.springRestAPI.model.Employee;
import com.kanand.springRestAPI.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/getEmployee/{id}")
	public String getEmployeeViaId(@PathVariable Long id) {
		return "fetching employee of id " + id;
	}

	@DeleteMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam Long id) {
		return "delete employee of id " + id;
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		return "saving employee of details " + employee;
	}

	@PutMapping("/updateEmployee/{id}")
	public String updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		return "updating employee of details " + employee + " for ID " + id;
	}
}
