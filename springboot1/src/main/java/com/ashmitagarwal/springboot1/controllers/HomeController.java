package com.ashmitagarwal.springboot1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Controller
public class HomeController {
	
	public String name;	
	
	public String getName() {
		return name;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Initializing...");
	}
	
	@Value("${myapp.name}")
	public void setName(String name) {
		this.name = name;
	}

	@ResponseBody
	@RequestMapping("hello")
	public String HelloWorld() {
		System.out.println(name);
		return "Hello World";
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Cleaning up...");
	}
}
