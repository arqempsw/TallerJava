package com.topdown.CreditCard.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ValidarTarjetas")
public class ValidarTarjetas {

    private int id;

    public ValidarTarjetas() {

    }

    public ValidarTarjetas(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}