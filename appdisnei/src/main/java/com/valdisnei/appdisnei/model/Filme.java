package com.valdisnei.appdisnei.model;

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
    @JoinTable(name = "elenco_ator",
            joinColumns = @JoinColumn(name = "filme_id"),
            inverseJoinColumns = @JoinColumn(name = "ator_id"))
    private ArrayList<Ator> elenco;
    private String diretor;
    private String produtor;


    // Constructor


    public Filme() {
    }

    public Filme( String titulo, String genero, int ano, double duracao,
                 String tipo, ArrayList<Ator> elenco, String diretor, String produtor) {
        super(titulo, genero, ano);
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
        if (duracao < 30.00){
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
