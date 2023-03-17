package com.valdisnei.appdisnei.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rotas {


    @GetMapping("/")
    public String rota(){
        return "Funcionou";
    }



}
