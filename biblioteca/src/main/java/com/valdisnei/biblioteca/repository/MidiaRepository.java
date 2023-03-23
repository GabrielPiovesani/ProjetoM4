package com.valdisnei.biblioteca.repository;

import com.valdisnei.biblioteca.model.Midia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MidiaRepository extends JpaRepository<Midia, Long> {
}
