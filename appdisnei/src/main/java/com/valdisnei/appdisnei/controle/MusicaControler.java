package com.valdisnei.appdisnei.controle;

import com.valdisnei.appdisnei.model.Musica;
import com.valdisnei.appdisnei.repositorio.MusicaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/musica")
public class MusicaControler {

    @Autowired
    private MusicaRepositorio musica;

    @GetMapping("/listar")
    public Iterable<Musica> listar(){
        return musica.findAll();
    }


    @PostMapping("/cadastrar")
    public Musica add(@RequestBody Musica playlist){
        return musica.save(playlist);
    }
}
