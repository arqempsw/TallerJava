package com.topdown.CreditCard.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topdown.CreditCard.Dialect.CreditCardDialect;

@RestController
@RequestMapping("/creditCardValidation")
public class CreditCardController {
	
	@Autowired
	CreditCardDialect creditCardDialect;
	
	@GetMapping(value="/")
	public String printData() {
		return creditCardDialect.getStringData();
	}

}
