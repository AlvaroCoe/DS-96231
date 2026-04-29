package com.example.projetoDTO.service;

import com.example.projetoDTO.dto.UsuarioRequestDTO;
import com.example.projetoDTO.dto.UsuarioResponseDTO;
import com.example.projetoDTO.entity.UsuarioEntity;
import com.example.projetoDTO.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    public UsuarioRepository repository;
    @Autowired
    public BCryptPasswordEncoder passwordEncoder;

    public List<UsuarioResponseDTO> ListarTodos () {

        return repository
                .findAll()
                .stream()
                .map((u -> new UsuarioResponseDTO(u.getId(), u.getNome())))
                .toList();
    }

    public UsuarioEntity SalvarUsuario (UsuarioRequestDTO usuarioDTO) {
        if (repository.findByEmail(usuarioDTO.getEmail()).isPresent()) {
            throw new RuntimeException("Usuário já cadastrado.");
        }
        UsuarioEntity novoUsuario = new UsuarioEntity();
        novoUsuario.setNome(usuarioDTO.getNome());
        novoUsuario.setEmail(usuarioDTO.getEmail());
        novoUsuario.setSenha(passwordEncoder.encode(usuarioDTO.getSenha()));


        return repository.save(novoUsuario);
    }
}

