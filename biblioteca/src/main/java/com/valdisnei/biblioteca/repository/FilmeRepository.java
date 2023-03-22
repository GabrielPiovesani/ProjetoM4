package com.valdisnei.biblioteca.repository;

import com.valdisnei.biblioteca.model.FilmeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<FilmeModel,Long> {
}
