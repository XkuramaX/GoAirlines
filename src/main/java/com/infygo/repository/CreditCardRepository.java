package com.infygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infygo.model.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, String> {

}
