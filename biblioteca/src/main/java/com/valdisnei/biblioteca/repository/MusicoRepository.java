package com.valdisnei.biblioteca.repository;

import com.valdisnei.biblioteca.model.MusicoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicoRepository extends JpaRepository<MusicoModel, Long> {
}
