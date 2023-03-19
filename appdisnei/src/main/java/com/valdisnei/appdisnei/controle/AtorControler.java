package com.valdisnei.appdisnei.controle;


import com.valdisnei.appdisnei.model.Ator;
import com.valdisnei.appdisnei.repositorio.AtorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ator")
public class AtorControler {

    @Autowired
    private AtorRepositorio ator;

    @GetMapping("/listar")
    public Iterable<Ator> listar(){
        return ator.findAll();
    }


    @PostMapping("/cadastrar")
    public Ator add(@RequestBody Ator obj){
        return ator.save(obj);
    }
}
