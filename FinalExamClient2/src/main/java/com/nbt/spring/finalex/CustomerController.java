package com.nbt.spring.finalex;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerRepository cusRepo;
	
	@PostMapping("/customer")
	@ResponseBody
	public String customer() {
		ObjectMapper om = new ObjectMapper();
		
		
		File f = new File();
	}
	
	

}
