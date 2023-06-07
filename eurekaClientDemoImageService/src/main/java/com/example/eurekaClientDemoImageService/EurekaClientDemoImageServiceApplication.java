package com.example.eurekaClientDemoImageService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientDemoImageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientDemoImageServiceApplication.class, args);
	}

}
