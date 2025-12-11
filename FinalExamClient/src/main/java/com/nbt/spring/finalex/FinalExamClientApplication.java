package com.nbt.spring.finalex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalExamClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalExamClientApplication.class, args);
		System.out.println("Client 1 running on port: 5672");
	}

}
