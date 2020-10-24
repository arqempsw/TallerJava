package com.topdown.CreditCard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.topdown.CreditCard.Entity.ValidarTarjetas;

@Repository
public interface CreditCardRepository extends JpaRepository<ValidarTarjetas, Integer>{

}