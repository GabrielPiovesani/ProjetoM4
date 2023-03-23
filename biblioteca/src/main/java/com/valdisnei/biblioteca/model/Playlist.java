package com.valdisnei.biblioteca.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Musica> musicas;
//    @OneToMany
//    private List<Filme> filmes;
    private int ordem;
    private int midiaAtual;
    private String nome;

    @Builder(builderMethodName = "PlaylistBuild")
    public Playlist(List<Musica> musicas, String nome) {
        this.musicas = musicas;
        this.nome = nome;
    }


}
