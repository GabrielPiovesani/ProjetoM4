package com.valdisnei.biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Musico extends Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String atuacao;

    @Builder(builderMethodName = "musicoBuild")
    public Musico(Long id, String nome, String dataNascimento, String premiacoes, String genero, Long id1, String atuacao) {
        super(id, nome, dataNascimento, premiacoes, genero);
        this.id = id1;
        this.atuacao = atuacao;
    }
}
