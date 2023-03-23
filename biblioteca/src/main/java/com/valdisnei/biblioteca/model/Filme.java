package com.valdisnei.biblioteca.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Filme extends Midia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double duracao;
    private String tipo;
    @OneToMany
    private List<Ator> elenco;
    private String diretor;
    private String produtor;

    @Builder(builderMethodName = "filmeBuild")
    public Filme(String titulo, int ano, String genero, double duracao, String tipo, List<Ator> elenco, String diretor, String produtor) {
        super(titulo, ano, genero);
        this.duracao = duracao;
        this.tipo = tipo;
        this.elenco = elenco;
        this.diretor = diretor;
        this.produtor = produtor;
    }

}
