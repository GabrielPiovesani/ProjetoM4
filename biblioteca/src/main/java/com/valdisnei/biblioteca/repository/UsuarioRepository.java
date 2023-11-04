package com.valdisnei.biblioteca.repository;

import com.valdisnei.biblioteca.dtos.usuarios.UsuarioDTO;
import com.valdisnei.biblioteca.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    boolean existsByEmail(String email);

    @Query("SELECT u FROM Usuario u WHERE u.email = :email")
    UsuarioDTO findByEmail(@Param("email") String email);
}
