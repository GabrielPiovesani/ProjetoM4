package com.valdisnei.biblioteca.repository;

import com.valdisnei.biblioteca.model.ArtistaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends JpaRepository<ArtistaModel, Long> {
}
