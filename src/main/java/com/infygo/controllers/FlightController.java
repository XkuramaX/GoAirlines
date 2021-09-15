package com.infygo.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infygo.model.Flights;
import com.infygo.service.FlightServiceImpl;

@RequestMapping("/api/flights")
@RestController
public class FlightController {

	public final FlightServiceImpl service;
	
	@Autowired
	public FlightController(FlightServiceImpl service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Flights> getAllFlights(){
		return service.getAllFlights();
	}
	
	@GetMapping("/destinations")
	public List<String> getAllDestinations(){
		return service.getAllDestinations();
	}
	
	@GetMapping("/sources")
	public List<String> getAllSource() {
		return service.getAllSources();
	}
	
	@GetMapping("{source}/{destination}/{date}")
	public List<Flights> getRequiredFlights(@PathVariable String source,@PathVariable String destination,@PathVariable String date){
		System.out.println(source+" "+" "+ destination +" "+ date);
		return service.getRequiredFlights(source, destination, date);
	}
	
}
