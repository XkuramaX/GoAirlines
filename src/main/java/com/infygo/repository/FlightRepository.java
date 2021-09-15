package com.infygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infygo.model.Flights;

public interface FlightRepository extends JpaRepository<Flights, String> {

}
