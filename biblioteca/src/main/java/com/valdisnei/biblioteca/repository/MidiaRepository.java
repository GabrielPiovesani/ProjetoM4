package com.valdisnei.biblioteca.repository;

import com.valdisnei.biblioteca.model.MidiaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MidiaRepository extends JpaRepository<MidiaModel, Long> {
}
