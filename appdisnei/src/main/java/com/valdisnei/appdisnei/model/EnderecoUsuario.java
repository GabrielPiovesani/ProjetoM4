package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class EnderecoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String logradouro, bairro, cidade, numeroDaCasa, complemento;

    @ManyToMany
    private List<Usuario> usuario;

}
