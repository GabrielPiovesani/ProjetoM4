package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private String senha;
    @OneToOne
    private Assinatura assinatura;

}
