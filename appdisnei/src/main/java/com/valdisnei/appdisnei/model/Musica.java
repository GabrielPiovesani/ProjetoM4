package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Musica extends Midia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private double duracao;

//    @OneToOne
//    @JoinColumn(name = "artista_id")
    private Artista artista;

    int nota;

}
