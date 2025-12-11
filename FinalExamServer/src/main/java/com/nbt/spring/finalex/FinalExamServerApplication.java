package com.nbt.spring.finalex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FinalExamServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalExamServerApplication.class, args);
		System.out.println("Server running on port: 5671");
	}

}
