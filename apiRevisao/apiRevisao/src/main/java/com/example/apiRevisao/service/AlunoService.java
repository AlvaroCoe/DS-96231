package com.example.apiRevisao.service;

import com.example.apiRevisao.entity.AlunoEntity;
import com.example.apiRevisao.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    //LISTAR

    public List<AlunoEntity>ListarAlunos (){
        return repository.findAll();
    }

    //ADICIONAR

public AlunoEntity AddAluno (AlunoEntity aluno) {
        if (repository.findByEmail(aluno.getEmail()).isPresent()) {
            throw new RuntimeException("Aluno já cadastrado com esse Email.");
        }
        return repository.save(aluno);
}

    //ATUALIZAR

public AlunoEntity AtualizarAluno (Long id, AlunoEntity aluno) {
    if (!repository.existsById(id)) {
        throw new IllegalArgumentException("Aluno não encontrado!");
        }

    aluno.setId(id);
    return repository.save(aluno);
    }

    //EXCLUIR

public void excluir (Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Aluno não encontrado!");
        }
        repository.deleteById(id);
    }
}














