package com.valdisnei.appdisnei.artista;

import com.valdisnei.appdisnei.artista.Artista;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Musico extends Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String atuacao;

    // Constructor


    public Musico() {
    }

    public Musico(int id, String atuacao) {
        this.id = id;
        this.atuacao = atuacao;
    }

    // get e set


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
}
