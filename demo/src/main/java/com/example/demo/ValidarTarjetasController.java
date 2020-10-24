package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ValidarTarjetasController {
    @Autowired
    private ValidarTarjetasRepository validarTarjetasRepository;

    @GetMapping("/ValidarTarjetas")
    public List<ValidarTarjetas> getAllValidarTarjetas() {
        return validarTarjetasRepository.findAll();
    }

    @GetMapping("/ValidarTarjetas/{id}")
    public ResponseEntity<ValidarTarjetas> getValidarTarjetasById(@PathVariable(value = "id") int validatorTargetsId)
            throws ResourceNotFoundException {
        ValidarTarjetas validarTarjetas = validarTarjetasRepository.findById(validatorTargetsId)
                .orElseThrow(() -> new ResourceNotFoundException("validarTarjetas not found for this id :: " + validatorTargetsId));
        return ResponseEntity.ok().body(validarTarjetas);
    }
}