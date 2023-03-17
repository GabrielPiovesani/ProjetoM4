package com.valdisnei.appdisnei.controle;

import com.valdisnei.appdisnei.model.Midia;
import com.valdisnei.appdisnei.servico.PlaylistServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rotas {

    @Autowired
    private PlaylistServico ps;

    @GetMapping("/listar/midia")
    public Iterable<Midia> listar(){
        return ps.listar();
    }

    @GetMapping("/")
    public String rota(){
        return "Funcionou";
    }



}
