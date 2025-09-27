package com.cloud.Employee_Service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.Employee_Service.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@GetMapping("/")
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		
		return List.of(
				new Employee(1,101,"John Doe","Developer"),
				new Employee(2,102,"Jane Smith","Manager"),
				new Employee(3,101,"Mike Johnson","Tester"),
				new Employee(4,103,"Emily Davis","Designer")
				);

	}
	
}
