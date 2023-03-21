package com.valdisnei.appdisnei.controle;

import com.valdisnei.appdisnei.model.Filme;
import com.valdisnei.appdisnei.model.Midia;
import com.valdisnei.appdisnei.repositorio.FilmeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filme")
public class FilmeControler {

    @Autowired
    private FilmeRepositorio filme;

    @GetMapping("/listar")
    public Iterable<Filme> listar(){
        return filme.findAll();
    }

    @PutMapping("/cadastrar")
    public Filme add(@RequestBody Filme obj) {
        return filme.save(obj);
    }
}
