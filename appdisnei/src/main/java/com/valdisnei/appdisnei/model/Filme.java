package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Filme extends Midia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double duracao;

    private String tipo;

    @OneToMany
    @JoinTable(name = "elenco_ator",
            joinColumns = @JoinColumn(name = "filme_id"),
            inverseJoinColumns = @JoinColumn(name = "ator_id"))
    private ArrayList<Ator> elenco;

    private String diretor;

    private String produtor;


}
