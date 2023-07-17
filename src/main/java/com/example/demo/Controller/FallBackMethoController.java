package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethoController {

	@GetMapping("companyServiceFallBack")
	public String companyServiceFallBack()
	{
		return "Company Service is taking longer than Expected \n Please Try again later";
	}
	@GetMapping("departmentServiceFallBack")
	public String departmentServiceFallBack()
	{
		return "Department Service is taking longer than Expected \n Please Try again later";
	}
	
	@GetMapping("employeeServiceFallBack")
	public String employeeServiceFallBack()
	{
		return "Employee Service is taking longer than Expected \n Please Try again later";
	}
	
}
