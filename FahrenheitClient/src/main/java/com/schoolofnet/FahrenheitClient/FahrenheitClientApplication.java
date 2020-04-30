package com.schoolofnet.FahrenheitClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FahrenheitClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FahrenheitClientApplication.class, args);
	}

}
