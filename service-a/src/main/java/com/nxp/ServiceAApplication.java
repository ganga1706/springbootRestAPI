package com.nxp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ServiceAApplication {
// added new comments
	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}

}
