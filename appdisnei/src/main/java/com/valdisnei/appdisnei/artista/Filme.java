package com.valdisnei.appdisnei.artista;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Filme extends Midia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double duracao;
    private String tipo;

    @OneToMany
    private ArrayList<Ator> elenco;
    private String diretor;
    private String produtor;


    // Constructor


    public Filme() {
    }

    public Filme(int id, String titulo, String genero, int ano, int id1, double duracao,
                 String tipo, ArrayList<Ator> elenco, String diretor, String produtor) {
        super(id, titulo, genero, ano);
        this.id = id1;
        this.duracao = duracao;
        this.setTipo(duracao);
        this.elenco = elenco;
        this.diretor = diretor;
        this.produtor = produtor;
    }

    // get e set


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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(double duracao) {
        if (duracao < 0.30){
            this.tipo = "Curta";
        } else {
            this.tipo = "Longa";
        }
    }

    public ArrayList<Ator> getElenco() {
        return elenco;
    }


    public String getDiretor() {
        return diretor;
    }


    public String getProdutor() {
        return produtor;
    }

}
