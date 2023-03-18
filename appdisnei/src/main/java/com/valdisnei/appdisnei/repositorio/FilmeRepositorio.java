package com.valdisnei.appdisnei.repositorio;

import com.valdisnei.appdisnei.model.Filme;
import com.valdisnei.appdisnei.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepositorio extends CrudRepository<Filme, Integer> {
}
