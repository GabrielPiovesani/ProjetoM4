package com.valdisnei.appdisnei.servico;

import com.valdisnei.appdisnei.model.Midia;
import com.valdisnei.appdisnei.model.Musica;
import com.valdisnei.appdisnei.model.Playlist;
import com.valdisnei.appdisnei.repositorio.MidiaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaylistServico {

    @Autowired
    private MidiaRepositorio mr;

    //Método para listar musicas da playlist
    public Iterable<Midia> listar(){
        return mr.findAll();
    }
}
