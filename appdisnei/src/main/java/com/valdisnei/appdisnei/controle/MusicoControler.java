package com.valdisnei.appdisnei.controle;

import com.valdisnei.appdisnei.model.Musico;
import com.valdisnei.appdisnei.repositorio.MusicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Musico")
public class MusicoControler {

    @Autowired
    private MusicoRepositorio musico;

    @GetMapping("/listar")
    public Iterable<Musico> listar(){
        return musico.findAll();
    }

    @PutMapping("/cadastrar")
    public Musico add(@RequestBody Musico obj){
        return musico.save(obj);
    }
}
