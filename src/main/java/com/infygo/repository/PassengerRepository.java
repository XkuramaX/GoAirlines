package com.infygo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.infygo.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, String> {

}
