package com.valdisnei.appdisnei.repositorio;

import com.valdisnei.appdisnei.model.Midia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MidiaRepositorio extends CrudRepository<Midia, Integer>{


}
