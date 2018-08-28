package com.limit.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.limit"})
public class LimitsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceApplication.class, args);
	}
}
