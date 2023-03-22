package com.valdisnei.biblioteca.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ator extends Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String formacao;

    @Builder(builderMethodName = "atorBuild")
    public Ator(Long id, String nome, String dataNascimento, String premiacoes, String genero, Long id1, String formacao) {
        super(id, nome, dataNascimento, premiacoes, genero);
        this.id = id1;
        this.formacao = formacao;
    }
}
