package com.valdisnei.biblioteca.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Musica extends Midia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double duracao;
    private int nota;
    @OneToOne
    private Musico musico;

    @Builder(builderMethodName = "musicaBuild")
    public Musica(String titulo, int ano, String genero, double duracao, int nota, Musico musico) {
        super(titulo, ano, genero);
        this.duracao = duracao;
        this.nota = nota;
        this.musico = musico;
    }
}
