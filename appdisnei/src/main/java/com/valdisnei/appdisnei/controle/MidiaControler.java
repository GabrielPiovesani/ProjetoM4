package com.valdisnei.appdisnei.controle;

import com.valdisnei.appdisnei.model.Midia;
import com.valdisnei.appdisnei.model.Musico;
import com.valdisnei.appdisnei.repositorio.MidiaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/midia")
public class MidiaControler {

    @Autowired
    private MidiaRepositorio midia;

    @GetMapping("/listar")
    public Iterable<Midia> listar(){
        return midia.findAll();
    }

    @PutMapping("/cadastrar")
    public Midia add(@RequestBody Midia obj){
        return midia.save(obj);
    }
}
