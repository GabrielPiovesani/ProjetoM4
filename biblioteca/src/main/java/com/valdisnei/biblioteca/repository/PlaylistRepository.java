package com.valdisnei.biblioteca.repository;

import com.valdisnei.biblioteca.model.PlaylistModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends JpaRepository<PlaylistModel, Long> {
}
