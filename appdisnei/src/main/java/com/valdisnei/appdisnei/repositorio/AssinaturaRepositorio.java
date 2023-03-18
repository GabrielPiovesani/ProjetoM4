package com.valdisnei.appdisnei.repositorio;


import com.valdisnei.appdisnei.model.Assinatura;
import com.valdisnei.appdisnei.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssinaturaRepositorio extends CrudRepository<Assinatura, Integer> {
}
