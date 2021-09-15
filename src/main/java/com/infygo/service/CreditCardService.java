package com.infygo.service;

import java.util.List;

import com.infygo.dto.CreditCardDTO;
import com.infygo.model.CreditCard;
import com.infygo.rest.objs.CreditCardRequestBody;

public interface CreditCardService {
	public List<CreditCard>  getAllCreditCards();
	public CreditCardDTO getCreditCard(String id);
	public Boolean transaction(CreditCardRequestBody card);
}
