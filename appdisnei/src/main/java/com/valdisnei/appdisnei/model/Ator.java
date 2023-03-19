package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;

@Entity
public class Ator extends Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String formacao;

    // Constructor


    public Ator() {
    }

    public Ator( String formacao) {
        this.formacao = formacao;
    }

    // get e set


    public int getId() {
        return id;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
