package com.valdisnei.appdisnei.controle;

import com.valdisnei.appdisnei.model.Usuario;
import com.valdisnei.appdisnei.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioControler {

    @Autowired
    private UsuarioRepositorio usuario;

    @GetMapping("/listar")
    public Iterable<Usuario> listar(){
        return usuario.findAll();
    }

    @PostMapping("/cadastrar")
    public Usuario add(@RequestBody Usuario obj){
        return usuario.save(obj);
    }
}
