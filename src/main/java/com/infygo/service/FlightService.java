package com.infygo.service;

import java.time.LocalDate;
import java.util.List;

import com.infygo.dto.FlightsDTO;
import com.infygo.model.Flights;

public interface FlightService {
	public List<Flights> getAllFlights();
	public FlightsDTO getFlight(String id);
	public List<Flights> getRequiredFlights(String source, String destination, String date);
	public List<String> getAllSources();
	public List<String> getAllDestinations();
}
