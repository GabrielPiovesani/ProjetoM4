package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Assinatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String planos;

    private double valorAssinatura;

    private LocalDate dataDeExpiracao;

//CONSTRUTOR
    public Assinatura() {
    }

    public Assinatura(int id, String planos, double valorAssinatura, LocalDate dataDeExpiracao) {
        this.id = id;
        this.planos = planos;
        this.valorAssinatura = valorAssinatura;
        this.dataDeExpiracao = dataDeExpiracao;
    }


//    GET AND SET

    public int getId() {
        return id;
    }

    public String getPlanos() {
        return planos;
    }

    public double getValorAssinatura() {
        return valorAssinatura;
    }

    public LocalDate getDataDeExpiracao() {
        return dataDeExpiracao;
    }
}
