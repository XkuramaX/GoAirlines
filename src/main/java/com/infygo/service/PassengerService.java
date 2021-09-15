package com.infygo.service;

import java.util.List;

import com.infygo.dto.PassengerDTO;
import com.infygo.model.Passenger;
import com.infygo.rest.objs.PassengerRequestBody;

public interface PassengerService {
	public List<Passenger> getAllPassengers();
	public PassengerDTO getPassenger(String id);
	public PassengerDTO createPassenger(PassengerRequestBody req, String pnr);
}
