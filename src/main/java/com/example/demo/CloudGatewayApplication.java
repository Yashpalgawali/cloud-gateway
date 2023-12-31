package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient

public class CloudGatewayApplication {

//	@Autowired
//	CircuitBreaker circuitbreaker;
	
	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
	}
}
 