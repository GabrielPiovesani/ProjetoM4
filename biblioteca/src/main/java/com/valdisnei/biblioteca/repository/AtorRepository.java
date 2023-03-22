package com.valdisnei.biblioteca.repository;

import com.valdisnei.biblioteca.model.AtorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository extends JpaRepository<AtorModel, Long> {
}
