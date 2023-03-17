package com.valdisnei.appdisnei.artista;

import jakarta.persistence.*;

@Entity
public class Midia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String titulo, genero;
    private int ano;

    @OneToOne
    private BibliotecaM bibliotecaM;
    @ManyToOne
    private Playlist playlist;

    public Midia() {
    }

    public Midia(int id, String titulo, String genero, int ano) {
        this.setId(id);
        this.setTitulo(titulo);
        this.setGenero(genero);
        this.setAno(ano);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
