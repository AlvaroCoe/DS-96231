package com.example.dto_revisao.service;

import com.example.dto_revisao.dto.UsuarioRequestDTO;
import com.example.dto_revisao.dto.UsuarioResponseDTO;
import com.example.dto_revisao.entity.UsuarioEntity;
import com.example.dto_revisao.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    //LISTAR
    public List<UsuarioResponseDTO> ListarTodos () {
        return repository
                .findAll()
                .stream()
                .map(f -> new UsuarioResponseDTO(
                        f.getNome(),
                        f.getTelefone()
                ))
                .toList();

    }
    //ADICIONAR

    public UsuarioEntity SalvarUsuario (UsuarioRequestDTO dto) {
        if (repository.findByEmail(dto.getEmail()).isPresent()) {
            throw new RuntimeException("Usuário já cadastrado.");
        }

        UsuarioEntity novoUsuario = new UsuarioEntity();
        novoUsuario.setNome(dto.getNome());
        novoUsuario.setEmail(dto.getEmail());
        novoUsuario.setTelefone(dto.getTelefone());
        novoUsuario.setSenha(passwordEncoder.encode(dto.getSenha()));

        return repository.save(novoUsuario);

    }
    //ATUALIZAR

    public UsuarioEntity AtualizarUsuario (Long id, UsuarioEntity usuario) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Usuário não encontrado!");
        }

        usuario.setId(id);
        return repository.save(usuario);
    }

    //EXCLUIR

    public void excluir (Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Usuário não encontrado!");
        }
        repository.deleteById(id);
    }

}

