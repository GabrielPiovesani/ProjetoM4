package com.valdisnei.biblioteca.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

@MappedSuperclass
@Getter @Setter
@NoArgsConstructor
public class Midia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private int ano;
    private String genero;

    @Builder
    public Midia(String titulo, int ano, String genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
    }
}
