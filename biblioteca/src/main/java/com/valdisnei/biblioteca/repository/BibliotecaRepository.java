package com.valdisnei.biblioteca.repository;

import com.valdisnei.biblioteca.model.BibliotecaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecaRepository extends JpaRepository<BibliotecaModel, Long> {
}
