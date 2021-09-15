package com.infygo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infygo.rest.objs.TicketRequestBody;
import com.infygo.rest.objs.TicketResponse;
import com.infygo.service.TicketServiceImpl;

@RequestMapping("/InfyGoBoot/book")
@RestController
public class BookingController {
	public final TicketServiceImpl service;
	
	@Autowired
	public BookingController(TicketServiceImpl service) {
		this.service = service;
	}
	
	@PostMapping("{flightId}/{userId}")
	public TicketResponse book(@PathVariable String flightId, @PathVariable String userId, @RequestBody TicketRequestBody request) {
		return service.bookTicket(request, flightId, userId);
	}
}
