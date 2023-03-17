package com.valdisnei.appdisnei.artista;

import com.valdisnei.appdisnei.artista.Artista;
import com.valdisnei.appdisnei.artista.Midia;
import jakarta.persistence.*;

@Entity
public class Musica extends Midia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double duracao;

    @OneToOne
    private Artista artista;
    int nota;


    //Constructor


    public Musica() {
    }

    public Musica(int id, String titulo, String genero, int ano, int id1, double duracao, Artista artista, int nota) {
        super(id, titulo, genero, ano);
        this.id = id1;
        this.duracao = duracao;
        this.artista = artista;
        this.nota = nota;
    }

    // get set
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
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
