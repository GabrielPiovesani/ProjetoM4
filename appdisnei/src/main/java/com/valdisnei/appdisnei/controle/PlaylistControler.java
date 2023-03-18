package com.valdisnei.appdisnei.controle;

import com.valdisnei.appdisnei.model.Midia;
import com.valdisnei.appdisnei.model.Playlist;
import com.valdisnei.appdisnei.repositorio.PlaylistRepositorio;
import com.valdisnei.appdisnei.servico.PlaylistServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/playlis")
public class PlaylistControler {

    @Autowired
    private PlaylistRepositorio ps;





    @GetMapping("/listar")
    public Iterable<Playlist> listar(){
        return ps.findAll();
    }


   @PostMapping("/cadastrar")
    public Playlist add(@RequestBody Playlist playlist){
        return ps.save(playlist);
   }



}
