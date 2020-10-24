package com.topdown.CreditCard.ServiceImpl;

import com.workshop.wsdl.ObjectFactory;
import com.workshop.wsdl.VerifyCreditCardResponseElement;
import org.springframework.stereotype.Service;

import com.topdown.CreditCard.Service.CreditCardService;


@Service
public class CreditCardServiceImplementation implements CreditCardService {


	@Override
	public Boolean verifyCreditCard() {
		// TODO Auto-generated method stub
		ObjectFactory objImpl = new ObjectFactory();
		VerifyCreditCardResponseElement verifyResponse = objImpl.createVerifyCreditCardResponseElement();
		return verifyResponse.isResult();
	}
}
