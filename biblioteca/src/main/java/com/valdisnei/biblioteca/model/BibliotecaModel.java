package com.valdisnei.biblioteca.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BibliotecaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<MusicaModel> musicas;
    @OneToMany
    private List<FilmeModel> filmes;

    @OneToOne
    private UsuarioModel usuario;

    @OneToMany
    private List<PlaylistModel> playlist;
}
