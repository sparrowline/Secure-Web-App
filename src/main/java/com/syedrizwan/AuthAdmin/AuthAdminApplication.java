package com.syedrizwan.AuthAdmin;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AuthAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthAdminApplication.class, args);
		System.err.println("Hello World");
	}

	
}
