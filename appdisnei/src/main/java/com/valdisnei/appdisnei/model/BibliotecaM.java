package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class BibliotecaM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    private List<Midia> midia;

    @OneToOne
    private Usuario usuario;

    @OneToMany
    @JoinTable(name = "biblioteca_playlist",
            joinColumns = @JoinColumn(name = "biblioteca_id"),
            inverseJoinColumns = @JoinColumn(name = "playlist_id"))
    private List<Playlist> playlist;


    // Constructor


    public BibliotecaM() {
    }

    public BibliotecaM( List<Midia> midia, Usuario usuario, List<Playlist> playlist) {
        this.midia = midia;
        this.usuario = usuario;
        this.playlist = playlist;
    }

    public int getId() {
        return id;
    }

    public List<Midia> getMidia() {
        return midia;
    }

    public void setMidia(List<Midia> midia) {
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
