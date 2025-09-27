package com.cloud.Deparment_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DeparmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeparmentServiceApplication.class, args);
	}

}
