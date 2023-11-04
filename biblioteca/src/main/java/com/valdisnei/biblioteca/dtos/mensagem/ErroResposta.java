package com.valdisnei.biblioteca.dtos.mensagem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErroResposta {

    private String mensagem;
    private int codigo;
}
