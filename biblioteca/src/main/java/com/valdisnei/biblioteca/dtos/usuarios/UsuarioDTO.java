package com.valdisnei.biblioteca.dtos.usuarios;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private Long id;
    private String nome;
    private String senha;
    private String email;
}

