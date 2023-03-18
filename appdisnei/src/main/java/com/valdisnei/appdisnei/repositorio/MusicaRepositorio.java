package com.valdisnei.appdisnei.repositorio;

import com.valdisnei.appdisnei.model.Musica;
import com.valdisnei.appdisnei.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepositorio extends CrudRepository<Musica, Integer> {
}
