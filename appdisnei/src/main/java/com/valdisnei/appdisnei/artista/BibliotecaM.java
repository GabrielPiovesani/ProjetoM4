package com.valdisnei.appdisnei.artista;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class BibliotecaM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Midia midia;

    @OneToOne
    private Usuario usuario;

    @OneToMany
    private List<Playlist> playlist;


    // Constructor


    public BibliotecaM() {
    }

    public BibliotecaM(int id, Midia midia, Usuario usuario, List<Playlist> playlist) {
        this.id = id;
        this.midia = midia;
        this.usuario = usuario;
        this.playlist = playlist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Playlist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<Playlist> playlist) {
        this.playlist = playlist;
    }
}
