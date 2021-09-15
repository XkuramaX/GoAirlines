package com.infygo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infygo.dto.CreditCardDTO;
import com.infygo.model.CreditCard;
import com.infygo.repository.CreditCardRepository;
import com.infygo.rest.objs.CreditCardRequestBody;


@Service("creditCardService")
public class CreditCardServiceImpl implements CreditCardService {

	@Autowired
	private CreditCardRepository repo;
	@Override
	public List<CreditCard> getAllCreditCards() {
		
		return repo.findAll();
	}

	@Override
	public CreditCardDTO getCreditCard(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id).isPresent()? CreditCard.prepareCreditCardDTO(repo.findById(id).get()):null;
	}

	@Override
	public Boolean transaction(CreditCardRequestBody card) {
		// TODO Auto-generated method stub
		String id = card.getCardNumber();
		CreditCardDTO card1 = getCreditCard(id);
		
		if(card.getCardHolderName().equals(card1.getName()) && card.getCvv().equals(card1.getCvv()) && card.getExpiryMonth().equals(card1.getExpiryMonth()) && card.getExpiryYear().equals(card1.getExpiryYear()) && card.getPin().equals(card1.getPin()))
			return true;
		return false;
	}

}
