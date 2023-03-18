package com.valdisnei.appdisnei.repositorio;

import com.valdisnei.appdisnei.model.EnderecoUsuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepositorio extends CrudRepository<EnderecoUsuario, Integer> {
}
