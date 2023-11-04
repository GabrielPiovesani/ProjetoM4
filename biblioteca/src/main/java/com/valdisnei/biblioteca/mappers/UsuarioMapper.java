package com.valdisnei.biblioteca.mappers;

import com.valdisnei.biblioteca.dtos.usuarios.UsuarioDTO;
import com.valdisnei.biblioteca.model.Usuario;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(usuario.getId());
        usuarioDTO.setNome(usuario.getNome());
        usuarioDTO.setSenha(usuario.getSenha());
        usuarioDTO.setEmail(usuario.getEmail());
        return usuarioDTO;
    }

    public static Usuario toEntity(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setId(usuarioDTO.getId());
        usuario.setNome(usuarioDTO.getNome());
        usuario.setSenha(usuarioDTO.getSenha());
        usuario.setEmail(usuarioDTO.getEmail());
        return usuario;
    }


    public static void updateEntityFromDTO(Usuario usuario, UsuarioDTO usuarioDTO) {
        // Atualize os campos da entidade 'usuario' com os valores do DTO 'usuarioDTO'
        usuario.setNome(usuarioDTO.getNome());
        usuario.setSenha(usuarioDTO.getSenha());
        usuario.setEmail(usuarioDTO.getEmail());
    }
}
