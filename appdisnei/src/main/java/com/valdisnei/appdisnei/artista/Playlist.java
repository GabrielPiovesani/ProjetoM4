package com.valdisnei.appdisnei.artista;

import com.valdisnei.appdisnei.artista.BibliotecaM;
import com.valdisnei.appdisnei.artista.Midia;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private BibliotecaM bibliotecaM;
    @OneToMany
    private ArrayList<Midia> midias;
    private int ordem;

    private Midia midiaAtual;


    // Constructor
    public Playlist() {
    }

    public Playlist(int id, ArrayList<Midia> midias, int ordem, Midia midiaAtual) {
        this.id = id;
        this.midias = midias;
        this.ordem = ordem;
        this.midiaAtual = midiaAtual;
    }



    // Get e Set


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Midia getMidiaAtual() {
        return midiaAtual;
    }

    public void setMidiaAtual(Midia midiaAtual) {
        this.midiaAtual = midiaAtual;
    }
}
