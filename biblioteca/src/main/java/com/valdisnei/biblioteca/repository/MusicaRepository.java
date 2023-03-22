package com.valdisnei.biblioteca.repository;

import com.valdisnei.biblioteca.model.MusicaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository extends JpaRepository<MusicaModel, Long> {
}
