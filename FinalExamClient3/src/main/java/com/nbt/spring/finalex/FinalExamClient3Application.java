package com.nbt.spring.finalex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalExamClient3Application {

	public static void main(String[] args) {
		SpringApplication.run(FinalExamClient3Application.class, args);
		System.out.println("Client 3 running on port 5672");
	}

}
