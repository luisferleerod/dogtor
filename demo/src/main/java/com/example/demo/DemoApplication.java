package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entidad.User;

@Configuration //desarrollo beans
@EnableAutoConfiguration //activar autoconfig
@ComponentScan
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public User user() {
		return new User("juan", 
		"123456", 
		"cirujano",
		1);
	}
		
    

}
