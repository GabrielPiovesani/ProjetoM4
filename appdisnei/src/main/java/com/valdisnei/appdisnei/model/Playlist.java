package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @OneToMany
    @JoinTable(name = "playlist_midias",
            joinColumns = @JoinColumn(name = "playlist_id"),
            inverseJoinColumns = @JoinColumn(name = "midias_id"))
    private ArrayList<Midia> midias;
    private int ordem;


    private String midiaAtual;


    // Constructor
    public Playlist() {
    }

    public Playlist( ArrayList<Midia> midias, int ordem, String midiaAtual) {
        this.midias = midias;
        this.ordem = ordem;
        this.midiaAtual = midiaAtual;
    }



    // Get e Set


    public int getId() {
        return id;
    }

    public ArrayList<Midia> getMidias() {
        return midias;
    }

    public void setMidias(ArrayList<Midia> midias) {
        this.midias = midias;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public String getMidiaAtual() {
        return midiaAtual;
    }

    public void setMidiaAtual(String midiaAtual) {
        this.midiaAtual = midiaAtual;
    }


}
