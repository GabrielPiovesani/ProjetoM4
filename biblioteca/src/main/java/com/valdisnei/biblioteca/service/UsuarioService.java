package com.valdisnei.biblioteca.service;

import com.valdisnei.biblioteca.dtos.usuarios.LoginDTO;
import com.valdisnei.biblioteca.dtos.usuarios.UsuarioDTO;

public interface UsuarioService {
    UsuarioDTO criarUsuario(UsuarioDTO usuarioDTO);
    UsuarioDTO buscarUsuarioPorId(Long id);
    UsuarioDTO atualizarUsuario(Long id, UsuarioDTO usuarioDTO);
    boolean deletarUsuario(Long id);

    UsuarioDTO loginUsuario(LoginDTO loginDTO);
}
