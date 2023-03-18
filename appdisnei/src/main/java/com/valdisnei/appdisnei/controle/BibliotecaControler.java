package com.valdisnei.appdisnei.controle;


import com.valdisnei.appdisnei.model.BibliotecaM;
import com.valdisnei.appdisnei.repositorio.BibliotecaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaControler {

    @Autowired
    private BibliotecaRepositorio biblioteca;

    @GetMapping("/listar")
    public Iterable<BibliotecaM> listar(){
        return biblioteca.findAll();
    }


    @PostMapping("/cadastrar")
    public BibliotecaM add(@RequestBody BibliotecaM obj){
        return biblioteca.save(obj);
    }
}
