package com.nbt.spring.finalex;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerRepository cusRepo;

	@PostMapping("/process")
	@ResponseBody
	public String customer(@RequestParam("address") String address) {
		ObjectMapper om = new ObjectMapper();

		File f = new File(
				"E:\\Classes\\Sem-4\\Thursday\\EAM\\FinalProject\\FinalExamClient3\\target\\reservation.json");
		System.out.println("File read successfully!!");

		try {
			JsonNode node = om.readTree(f);

			String details = node.get("firstName").asText() + " " + node.get("lastName").asText();

			Customer customer = new Customer(null, address, details);
			
			cusRepo.save(customer);

			return "Customer Details added successfully!!";

		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

}
