package com.nbt.spring.finalex;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class ReservationController {
	
	@Autowired
	ReservationRepository resRepo;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("reservation", new Reservation());
		return "Home";
	}
	
	@PostMapping("/reserve")
	public @ResponseBody String reserve(
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("numberOfPassengers") String numberOfPassengers,
			@RequestParam("travelClass") String travelClass,
			@RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("time") String time,
			@RequestParam("dateOfDeparting") String dateOfDeparting
			) {
		
		ObjectMapper om = new ObjectMapper();
		
		Reservation reservation = new Reservation(firstName,
				lastName,
				Integer.parseInt(numberOfPassengers),
				travelClass,
				phoneNumber,
				time,
				dateOfDeparting);
		
		Reservation savedReservation = resRepo.save(reservation);
		
		File f = new File("target/reservation.json");
		
		try {
			om.writeValue(f, savedReservation);
		} catch (Exception e) {
			e.getMessage();
		}
		
		return "Reservation Successfull!";
		
	}

}
