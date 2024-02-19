package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //desarrollo beans
@EnableAutoConfiguration //activar autoconfig
@ComponentScan
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public com.example.demo.entidad.User user() {
		return new com.example.demo.entidad.User("juan", 
		"123456", 
		"cirujano",
		1);
	}
		
    

}
