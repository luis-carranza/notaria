package com.carranza.notaria.tramites.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by luis_carranza on 3/6/18.
 */

@Entity
public class Tramite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tramiteId;

    private String cliente;
    private String owner;
    private String status;
    private String nextStep;

    public Tramite(String cliente, String owner, String status, String nextStep) {
        this.cliente = cliente;
        this.owner = owner;
        this.status = status;
        this.nextStep = nextStep;
    }

    public Tramite() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNextStep() {
        return nextStep;
    }

    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }
}
