package com.cloud.Deparment_Service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.cloud.Deparment_Service.client.EmployeeClient;
import com.cloud.Deparment_Service.dto.EmployeeDto;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	private final WebClient.Builder webClient;
	
	private final RestTemplate restTemplate;
	
	private final EmployeeClient employeeClient;
	
	
	public DepartmentController(WebClient.Builder webClientBuilder, 
			                                RestTemplate restTemplate,
			                                EmployeeClient employeeClient) {
		
		this.webClient = webClientBuilder.baseUrl("http://EMPLOYEE-SERVICE/employees");
				                              
		this.restTemplate = restTemplate;
		
		this.employeeClient = employeeClient;
		
	}
	
	@GetMapping("/")
	public List<String> getDepartments() {
		return List.of("HR", "Finance", "IT", "Marketing");
	}
	
	@GetMapping("/with-employee-webclient")
	public List<EmployeeDto> getEmployees(){
		
		 return webClient.build()
		            .get()
		            .uri("/")
		            .retrieve()
		            .bodyToFlux(EmployeeDto.class)
		            .collectList()
		            .block();
		
	}
	
	
	@GetMapping("/with-employee-resttemplate")
	public List<EmployeeDto> getEmployeesRestTemplate(){
		
		EmployeeDto[] Employees = restTemplate
				                     .getForObject("http://EMPLOYEE-SERVICE/employees/", EmployeeDto[].class);
		
		return List.of(Employees);
	}
	
	@GetMapping("/with-employee-feignclient")
	public List<EmployeeDto> getEmployeesFeignClint(){
		return employeeClient.getEmployees();
	}
	
	
}
