package com.valdisnei.appdisnei.controle;

import com.valdisnei.appdisnei.model.Artista;
import com.valdisnei.appdisnei.model.Assinatura;
import com.valdisnei.appdisnei.repositorio.ArtistaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artista")
public class ArtistaControler {

    @Autowired
    private ArtistaRepositorio artista;

    @GetMapping("/listar")
    public Iterable<Artista> listar(){
        return artista.findAll();
    }

    @PostMapping("/cadastrar")
    public Artista add(@RequestBody Artista obj){
        return artista.save(obj);
    }
}
