package com.topdown.CreditCard.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topdown.CreditCard.Entity.ValidarTarjetas;
import com.topdown.CreditCard.Exceptions.ResourceNotFoundException;
import com.topdown.CreditCard.Repository.CreditCardRepository;
import com.topdown.CreditCard.Dialect.CreditCardDialect;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CreditCardController {
    @Autowired
    private CreditCardRepository creditCardRepository;

    @Autowired
    private CreditCardDialect creditCardDialect;

    @GetMapping("/Validar")
    public Boolean validar() {
        return creditCardDialect.verifyCreditCard();
    }


    @GetMapping("/ValidarTarjetas")
    public List<ValidarTarjetas> getAllValidarTarjetas() {
        return creditCardRepository.findAll();
    }

    @GetMapping("/ValidarTarjetas/{id}")
    public ResponseEntity<ValidarTarjetas> getValidarTarjetasById(@PathVariable(value = "id") int validatorTargetsId)
            throws ResourceNotFoundException {
    	ValidarTarjetas validarTarjetas = creditCardRepository.findById(validatorTargetsId)
                .orElseThrow(() -> new ResourceNotFoundException("validarTarjetas not found for this id :: " + validatorTargetsId));
        return ResponseEntity.ok().body(validarTarjetas);
    }

}