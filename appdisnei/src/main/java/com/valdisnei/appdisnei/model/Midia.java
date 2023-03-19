package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;

@Entity
public class Midia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String titulo, genero;
    private int ano;

    public Midia() {
    }

    public Midia( String titulo, String genero, int ano) {
        this.setTitulo(titulo);
        this.setGenero(genero);
        this.setAno(ano);
    }

    public int getId() {
        return id;
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
