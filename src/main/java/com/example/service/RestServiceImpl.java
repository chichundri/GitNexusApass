package com.example.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.bean.Employee;

@Configuration
public class RestServiceImpl implements RestService {
	
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}

}
