package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Ator extends Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String formacao;

}
