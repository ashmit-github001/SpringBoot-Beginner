package com.ashmitagarwal.springmvc1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashmitagarwal.springmvc1.models.UserLoginDetails;
import com.ashmitagarwal.springmvc1.models.UserRegistrationDetails;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Controller
public class HomeController {
	
	@PostConstruct
	public void start() {
		System.out.println("Initializing...");
	}
	
	@RequestMapping("/")
	public String homePage() {
		return "HomePage";
	}
	
	@GetMapping("/userLogin")
	public String userLogin(Model model) {
		UserLoginDetails userLoginDetails = new UserLoginDetails();
		model.addAttribute(userLoginDetails);		
		return "UserLoginPage";
	}
	
	@GetMapping("/userRegistration")
	public String userRegistration() {
		return "UserRegistrationPage";
	}
	
	@ResponseBody
	@PostMapping("/userLogin")
	public UserLoginDetails userLogin(UserLoginDetails userLoginDetails) {
		String username = userLoginDetails.getUsername();
		String password = userLoginDetails.getPassword();
		
		System.out.println(username);
		System.out.println(password);
		
		if(!username.isBlank() && !password.isBlank())
		{
			if(username.equals("ashmit") && password.equals("password"))
			{
				userLoginDetails.setMessage("You are successfully logged in!");
				return userLoginDetails;
			}
		}
		userLoginDetails.setMessage("Invalid information, please try again! :(!");
		return userLoginDetails;
	}
	
	@PostMapping("/userRegistration")
	public UserRegistrationDetails userRegistration(UserRegistrationDetails userRegistrationDetails) {
		
		String fname = userRegistrationDetails.getFirstname();
		String mname = userRegistrationDetails.getMiddlename();
		String lname = userRegistrationDetails.getLastname();
		String username = userRegistrationDetails.getUsername();
		String email = userRegistrationDetails.getEmail();
		String password = userRegistrationDetails.getPassword();
		
		System.out.println(fname);
		System.out.println(mname);
		System.out.println(lname);
		System.out.println(username);
		System.out.println(email);
		System.out.println(password);
		
		if(!fname.isBlank() && !username.isBlank() && !email.isBlank() && !password.isBlank())
		{
			userRegistrationDetails.setMessage("You are successfully logged in!");
			return userRegistrationDetails;
		}
		
		userRegistrationDetails.setMessage("Invalid information, please try again! :(!");
		return userRegistrationDetails;
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Cleaning up...");
	}
}
