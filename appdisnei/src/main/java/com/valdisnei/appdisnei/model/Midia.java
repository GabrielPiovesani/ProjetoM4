package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;
import lombok.*;


@MappedSuperclass
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Midia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    private String genero;


    private int ano;


}
