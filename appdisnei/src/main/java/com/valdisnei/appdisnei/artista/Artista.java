package com.valdisnei.appdisnei.artista;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private LocalDate dataDeNascimento;
    private String premiacoes;
    private String genero;

    @OneToOne
    private Musica musica;

    @OneToOne
    private Filme filme;



    // Constructor

    public Artista() {
    }

    public Artista(int id, String nome, LocalDate dataDeNascimento, String premiacoes, String genero) {
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.premiacoes = premiacoes;
        this.genero = genero;
    }


    // get e set


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
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
