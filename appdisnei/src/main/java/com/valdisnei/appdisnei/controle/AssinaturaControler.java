package com.valdisnei.appdisnei.controle;

import com.valdisnei.appdisnei.model.Assinatura;
import com.valdisnei.appdisnei.repositorio.AssinaturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/assinatura")
public class AssinaturaControler {

    @Autowired
    private AssinaturaRepositorio assinatura;

    @GetMapping("/listar")
    public Iterable<Assinatura> listar(){
        return assinatura.findAll();
    }

    @PostMapping("/cadastrar")
    public Assinatura add(@RequestBody Assinatura as){
        return assinatura.save(as);
    }
}
