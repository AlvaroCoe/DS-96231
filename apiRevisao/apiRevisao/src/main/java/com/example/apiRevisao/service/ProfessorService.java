package com.example.apiRevisao.service;


import com.example.apiRevisao.entity.ProfessorEntity;
import com.example.apiRevisao.repository.ProfessorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.util.ClassUtils.isPresent;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    //LISTAR

    public List<ProfessorEntity> ListarProfessores () {
        return repository.findAll();
    }

    //ADICIONAR

    public ProfessorEntity AddProfessor (ProfessorEntity professor) {
        if (repository.findByEmail(professor.getEmail()).isPresent()) {
            throw new RuntimeException("Professor já cadastrado com esse email.");
        }
        return repository.save(professor);
    }

    //ATUALIZAR

    public ProfessorEntity AtualizarProfessor (Long id, ProfessorEntity professor) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Professor não encontrado!");
        }
        professor.setId(id);
        return repository.save(professor);
    }

    //EXCLUIR

    public void excluir (Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Professor não encontrado!");
        }
        repository.deleteById(id);
    }

}
