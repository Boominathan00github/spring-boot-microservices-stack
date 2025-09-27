package com.cloud.Deparment_Service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cloud.Deparment_Service.dto.EmployeeDto;

@FeignClient(name = "EMPLOYEE-SERVICE", path = "/employees" )
public interface EmployeeClient {

	@GetMapping("/")
	public List<EmployeeDto> getEmployees();
}
