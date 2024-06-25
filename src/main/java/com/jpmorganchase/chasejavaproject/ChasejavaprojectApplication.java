package com.jpmorganchase.chasejavaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RestController
@EntityScan
public class ChasejavaprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChasejavaprojectApplication.class, args);
	}

}
