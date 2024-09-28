package com.ashmitagarwal.springboot1.config;

//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan(basePackages= {"com.ashmitagarwal.springboot1.controllers"})
@SpringBootApplication(scanBasePackages= {"com.ashmitagarwal.springboot1.controllers"})
@PropertySource("/abc/application.properties")
public class AppStarter {

	public static void main(String[] args){
		
		//SpringApplication app = new SpringApplication(AppStarter.class);
		//app.run(args);
		SpringApplication.run(AppStarter.class, args);
	}
}
