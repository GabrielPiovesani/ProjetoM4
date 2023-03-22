package com.valdisnei.biblioteca.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
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
    public Musica(Long id, String titulo, int ano, String genero, Long id1, double duracao, int nota, Musico musico) {
        super(id, titulo, ano, genero);
        this.id = id1;
        this.duracao = duracao;
        this.nota = nota;
        this.musico = musico;
    }
}
