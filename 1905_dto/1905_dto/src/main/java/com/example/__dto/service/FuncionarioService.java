package com.example.__dto.service;


import com.example.__dto.dto.FuncionarioRequestDTO;
import com.example.__dto.dto.FuncionarioResponseDTO;
import com.example.__dto.entity.FuncionarioEntity;
import com.example.__dto.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;


    public List<FuncionarioResponseDTO> ListarFuncionario () {
        return repository
                .findAll().stream()
                .map(f -> new FuncionarioResponseDTO(
                        f.getNome(),
                        f.getMatricula(),
                        f.getEmail()
                ))
                .toList();
    }

    public FuncionarioEntity AddFuncionario (@Valid FuncionarioRequestDTO dto) {
        if (repository.findByEmail(dto.getEmail()).isPresent()){
            throw new RuntimeException("Email já em uso!");

        }

        FuncionarioEntity novoFuncionario = new FuncionarioEntity();
        novoFuncionario.setNome(dto.getNome());
        novoFuncionario.setMatricula(dto.getMatricula());
        novoFuncionario.setDataNascimento(dto.getDataNascimento());
        novoFuncionario.setSalario(dto.getSalario());
        novoFuncionario.setEmail(dto.getEmail());
        novoFuncionario.setEndereco(dto.getEndereco());

        return repository.save(novoFuncionario);

    }

    // ATUALIZAR EMAIL

    public FuncionarioEntity AtualizarFuncionario (String email, FuncionarioEntity dadosNovos) {
        FuncionarioEntity funcionarioExistente = repository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("Funcionario com email " + email     + " não encontrado"));

        // Mantém o ID original para atualizar o mesmo registro
        dadosNovos.setId(funcionarioExistente.getId());
        return repository.save(dadosNovos);
    }

    // DELETAR

    public void deletarFuncionario(String email) {
        if (repository.findByEmail(email).isEmpty()) {
            throw new IllegalArgumentException("Funcionário não encontrado com o login: " + email);
        }
        repository.deleteByEmail(email);
    }

}