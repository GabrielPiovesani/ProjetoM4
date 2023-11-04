package com.valdisnei.biblioteca.model;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@Data
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataNascimento;
    private String premiacoes;
    private String genero;

    @Builder(builderMethodName = "artistaBuild")
    public Artista(String nome, String dataNascimento, String premiacoes, String genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.premiacoes = premiacoes;
        this.genero = genero;
    }
}
