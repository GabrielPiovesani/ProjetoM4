package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@MappedSuperclass
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String dataDeNascimento;
    private String premiacoes;
    private String genero;

}
