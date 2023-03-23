package com.valdisnei.biblioteca.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Ator extends Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String formacao;

    @Builder(builderMethodName = "atorBuild")
    public Ator(String nome, String dataNascimento, String premiacoes, String genero, String formacao) {
        super(nome, dataNascimento, premiacoes, genero);
        this.formacao = formacao;
    }
}
