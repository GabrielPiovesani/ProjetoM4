package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;

@Entity
public class Musica extends Midia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double duracao;

    @OneToOne
    @JoinColumn(name = "artista_id")
    private Artista artista;
    int nota;


    //Constructor


    public Musica() {
    }

    public Musica(String titulo, String genero, int ano, double duracao, Artista artista) {
        super(titulo, genero, ano);
        this.duracao = duracao;
        this.artista = artista;
    }

    // get set
    @Override
    public int getId() {
        return id;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
