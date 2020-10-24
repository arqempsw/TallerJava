package com.topdown.CreditCard.Dialect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.topdown.CreditCard.Service.CreditCardService;

@Component
public class CreditCardDialect {
	
	@Autowired
	CreditCardService creditCardService;
	
	public Boolean verifyCreditCard() {
		return creditCardService.verifyCreditCard();
	}

}
