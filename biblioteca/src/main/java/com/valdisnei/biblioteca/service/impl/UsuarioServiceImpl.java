package com.valdisnei.biblioteca.service.impl;

import com.valdisnei.biblioteca.dtos.usuarios.LoginDTO;
import com.valdisnei.biblioteca.dtos.usuarios.UsuarioDTO;
import com.valdisnei.biblioteca.exception.EmailEmUsoException;
import com.valdisnei.biblioteca.mappers.UsuarioMapper;
import com.valdisnei.biblioteca.model.Usuario;
import com.valdisnei.biblioteca.repository.UsuarioRepository;
import com.valdisnei.biblioteca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public UsuarioDTO criarUsuario(UsuarioDTO usuarioDTO) {

        Usuario usuario = UsuarioMapper.toEntity(usuarioDTO); // Converte DTO em entidade

        if (usuarioRepository.existsByEmail(usuarioDTO.getEmail())) {
            throw new EmailEmUsoException("Email já está em uso");
        }


        usuario.setId(usuarioDTO.getId());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setNome(usuarioDTO.getNome());
        usuario.setSenha(usuario.getSenha());

        usuario = usuarioRepository.save(usuario);

        // Lógica para criar um usuário usando a entidade 'usuario'
        UsuarioDTO novoUsuarioDTO = UsuarioMapper.toDTO(usuario); // Converte a entidade em DTO


        return novoUsuarioDTO;
    }


    @Override
    public UsuarioDTO buscarUsuarioPorId(Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null); // Busca a entidade
        return UsuarioMapper.toDTO(usuario); // Converte a entidade em DTO
    }


    @Override
    public UsuarioDTO atualizarUsuario(Long id, UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null); // Busca a entidade
        if (usuario != null) {
            UsuarioMapper.updateEntityFromDTO(usuario, usuarioDTO); // Atualiza a entidade com base no DTO
            // Lógica para atualizar o usuário usando a entidade 'usuario'
            UsuarioDTO usuarioAtualizadoDTO = UsuarioMapper.toDTO(usuario); // Converte a entidade atualizada em DTO
            return usuarioAtualizadoDTO;
        } else {
            return null; // Tratamento de erro se o usuário não for encontrado
        }
    }


    @Override
    public boolean deletarUsuario(Long id) {
        usuarioRepository.deleteById(id); // Exclui o usuário do banco de dados
        return false;
    }

    @Override
    public UsuarioDTO loginUsuario(LoginDTO loginDTO) {
        UsuarioDTO usuarioEncontrado = usuarioRepository.findByEmail(loginDTO.getEmail());

        if (usuarioEncontrado != null && usuarioEncontrado.getSenha().equals(loginDTO.getSenha())) {
            return usuarioEncontrado; // Credenciais válidas
        } else {
            return null; // Credenciais inválidas
        }
    }

    public boolean isEmailAlreadyInUse(String email) {
        return usuarioRepository.existsByEmail(email);
    }


}

