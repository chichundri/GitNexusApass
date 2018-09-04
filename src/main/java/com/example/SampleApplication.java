package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.bean.Employee;
import com.example.service.RestService;

@SpringBootApplication
@ComponentScan(basePackages="com.example")
public class SampleApplication {
	
	@Autowired 
	RestService restService;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SampleApplication.class, args);
		Employee empRec1 = (Employee) context.getBean("getEmployee");
		System.out.println(empRec1.getId());
	}
}
