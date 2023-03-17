package com.valdisnei.appdisnei.artista;

import jakarta.persistence.*;

@Entity
public class Ator extends Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String formacao;

    @ManyToOne
    private Filme filme;

    // Constructor


    public Ator() {
    }

    public Ator(int id, String formacao) {
        this.id = id;
        this.formacao = formacao;
    }

    // get e set


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
