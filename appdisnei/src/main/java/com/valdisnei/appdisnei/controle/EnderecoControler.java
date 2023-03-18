package com.valdisnei.appdisnei.controle;


import com.valdisnei.appdisnei.model.EnderecoUsuario;
import com.valdisnei.appdisnei.repositorio.EnderecoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
public class EnderecoControler {

    @Autowired
    private EnderecoRepositorio endereco;

    @GetMapping("/listar")
    public Iterable<EnderecoUsuario> listar(){
        return endereco.findAll();
    }


    @PostMapping("/cadastrar")
    public EnderecoUsuario add(@RequestBody EnderecoUsuario obj){
        return endereco.save(obj);
    }
}
