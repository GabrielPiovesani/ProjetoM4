package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String dataDeNascimento;
    private String premiacoes;
    private String genero;





    // Constructor

    public Artista() {
    }

    public Artista( String nome, String dataDeNascimento, String premiacoes, String genero) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.premiacoes = premiacoes;
        this.genero = genero;
    }


    // get e set


    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(String premiacoes) {
        this.premiacoes = premiacoes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
