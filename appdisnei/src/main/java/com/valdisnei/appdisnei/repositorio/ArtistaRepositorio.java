package com.valdisnei.appdisnei.repositorio;


import com.valdisnei.appdisnei.model.Artista;
import com.valdisnei.appdisnei.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepositorio extends CrudRepository<Artista, Integer> {
}