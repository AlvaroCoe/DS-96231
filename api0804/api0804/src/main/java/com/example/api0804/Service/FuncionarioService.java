package com.example.api0804.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api0804.Entity.FuncionarioEntity;
import com.example.api0804.Repository.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioEntity> ListarTodos(){
    return repository.findAll();

}
    public FuncionarioEntity salvarFuncionario (FuncionarioEntity funcionario) {
        if (repository.findByCpf(funcionario.getCpf()).isPresent()){
            throw new IllegalArgumentException("Funcionario já cadastrado!");
        }
        return repository.save(funcionario);
    }

}

