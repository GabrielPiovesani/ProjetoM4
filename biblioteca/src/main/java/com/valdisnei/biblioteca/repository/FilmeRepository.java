package com.valdisnei.biblioteca.repository;

import com.valdisnei.biblioteca.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme,Long> {
}
