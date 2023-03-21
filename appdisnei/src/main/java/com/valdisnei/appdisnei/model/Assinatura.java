package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class Assinatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String planos;

    private double valorAssinatura;

    private LocalDate dataDeExpiracao;

}
