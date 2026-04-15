package com.example.api_service_excepetion.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_service_excepetion.Entity.FuncionarioEntity;
import com.example.api_service_excepetion.Repository.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioEntity> ListarFuncionarios() {
        return repository.findAll();
    }
//ESTUDAR
public FuncionarioEntity AddFuncionario(FuncionarioEntity funcionario) {
    if (repository.findByEmail(funcionario.getEmail()).isPresent()) {
        throw new RuntimeException("Funcionário já cadastrado com esse email");
    }
    return repository.save(funcionario);

    }

public FuncionarioEntity AtualizarFuncionario(Long id, FuncionarioEntity funcionario) {
    if (!repository.existsById(id)) {
        throw new IllegalArgumentException("Funcionário não encontrado!");
    }

    // Mantém o ID do funcionário para garantir que o registro existente seja atualizado
    // Em vez de criar um novo objeto, atualiza o existente
    // Altera todos os outros dadods

    funcionario.setId(id);
    return repository.save(funcionario);

    }

    public void excluir (Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Funcionário não encontrado!");
        }
        repository.deleteById(id);
    }
}