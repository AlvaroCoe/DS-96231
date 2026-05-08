package com.example.projetoDTO.service;

import com.example.projetoDTO.dto.FuncionarioRequestDTO;
import com.example.projetoDTO.dto.FuncionarioResponseDTO;
import com.example.projetoDTO.entity.FuncionarioEntity;
import com.example.projetoDTO.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<FuncionarioResponseDTO> ListarTodos () {
        return repository
                .findAll()
                .stream()
                .map(f -> new FuncionarioResponseDTO(
                        f.getNome(),
                        f.getEmail(),
                        f.getTelefone()
                ))
                .toList();

    }

    public FuncionarioEntity SalvarFuncionario (FuncionarioRequestDTO dto) {
        if (repository.findByEmail(dto.getEmail()).isPresent()) {
            throw new RuntimeException("Funcionário já cadastrado.");
        }

        FuncionarioEntity novoFuncionario = new FuncionarioEntity();
        novoFuncionario.setNome(dto.getNome());
        novoFuncionario.setEmail(dto.getEmail());
        novoFuncionario.setTelefone(dto.getTelefone());
        novoFuncionario.setSenha(passwordEncoder.encode(dto.getSenha()));

        return repository.save(novoFuncionario);



    }

}
