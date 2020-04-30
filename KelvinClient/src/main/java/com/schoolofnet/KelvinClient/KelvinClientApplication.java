package com.schoolofnet.KelvinClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class KelvinClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(KelvinClientApplication.class, args);
	}

}
